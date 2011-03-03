package com.rapleaf.hank.data_deployer;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import com.rapleaf.hank.coordinator.HostState;
import com.rapleaf.hank.coordinator.RingConfig;
import com.rapleaf.hank.coordinator.RingGroupConfig;
import com.rapleaf.hank.coordinator.RingState;

public class RingGroupUpdateTransitionFunctionImpl implements
    RingGroupUpdateTransitionFunction {

  @Override
  public void manageTransitions(RingGroupConfig ringGroup) throws IOException {
    boolean anyUpdatesPending = false;
    boolean anyDownOrUpdating = false;
    Queue<RingConfig> downable = new LinkedList<RingConfig>();

    for (RingConfig ring : ringGroup.getRingConfigs()) {
      if (ring.isUpdatePending()) {
        anyUpdatesPending = true;

        switch (ring.getState()) {
          case UP:
            // the ring is eligible to be taken down, but we don't want to
            // do that until we're sure no other ring is already down.
            // add it to the candidate queue.
            downable.add(ring);
            break;

          case GOING_DOWN:
            // the ring is going down, so we don't want to take any others down
            anyDownOrUpdating = true;

            // let's check if the ring is fully down or not.
            int numHostsIdle = ring.getNumHostsInState(HostState.IDLE);
            int numHostsOffline = ring.getNumHostsInState(HostState.OFFLINE);
            if (numHostsIdle + numHostsOffline == ring.getHosts().size()) {
              // sweet, everyone's either offline or idle.
              ring.setState(RingState.DOWN);
            } else {
              break;
            }
            // note that we are intentionally falling through here - we can take
            // the next step in the update process

          case DOWN:
            anyDownOrUpdating = true;

            // we just finished stopping
            // start up all the updaters
            ring.startAllUpdaters();
            ring.setState(RingState.UPDATING);
            break;

          case UPDATING:
            // need to let the updates finish before continuing
            anyDownOrUpdating = true;

            // let's check if we're done updating yet
            int numHostsUpdating = ring.getNumHostsInState(HostState.UPDATING);
            if (numHostsUpdating > 0) {
              // we're not done updating yet.
              break;
            } else {
              // hey, we're done updating!
              // tell any offline hosts to stay down, since they've missed the
              // update
              // TODO: implement this

              // set the ring state to updated
              ring.setState(RingState.UPDATED);
            }

            // note that we are intentionally falling through here so that we 
            // can go right into starting the hosts again.

          case UPDATED:
            anyDownOrUpdating = true;

            // sweet, we're done updating, so we can start all our daemons now
            ring.startAllPartDaemons();
            ring.setState(RingState.COMING_UP);
            break;

          case COMING_UP:
            // need to let the servers come online before continuing
            anyDownOrUpdating = true;

            // let's check if we're all the way online yet
            int numHostsServing = ring.getNumHostsInState(HostState.SERVING);
            numHostsOffline = ring.getNumHostsInState(HostState.OFFLINE);
            if (numHostsServing + numHostsOffline == ring.getHosts().size()) {
              // yay! we're all online!
              ring.setState(RingState.UP);
              ring.updateComplete();
            }

            break;
        }
        // if we saw a down or updating state, break out of the loop, since 
        // we've seen enough.
        if (anyDownOrUpdating) {
          break;
        }
      }
    }

    // as long as we didn't encounter any down or updating rings, we can take
    // down one of the currently up and not-yet-updated ones.
    if (!anyDownOrUpdating && !downable.isEmpty()) {
      RingConfig toDown = downable.poll();

      toDown.takeDownPartDaemons();
      toDown.setState(RingState.GOING_DOWN);
    }

    // if there are no updates pending, then it's impossible for for there to
    // be any new downable rings, and in fact, the ring is ready to go.
    // complete its update.
    if (!anyUpdatesPending) {
      ringGroup.updateComplete();
    }
  }
}