/**
 *  Copyright 2011 Rapleaf
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.rapleaf.hank.coordinator;

import org.apache.zookeeper.KeeperException;

public class DomainGroupDomainVersion implements Comparable<DomainGroupDomainVersion> {

  private final Domain domain;
  private final int versionNumber;

  public DomainGroupDomainVersion(final Domain domain,
                                  final int versionNumber) throws KeeperException, InterruptedException {
    this.domain = domain;
    this.versionNumber = versionNumber;
  }

  public Domain getDomain() {
    return domain;
  }

  public int getVersionNumber() {
    return versionNumber;
  }

  @Override
  public int compareTo(DomainGroupDomainVersion o) {
    return getDomain().getName().compareTo(o.getDomain().getName());
  }

  @Override
  public String toString() {
    return getDomain().getName() + "@v" + getVersionNumber();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    DomainGroupDomainVersion that = (DomainGroupDomainVersion) o;

    if (getDomain().getName() != null ? !getDomain().getName().equals(that.getDomain().getName()) : that.getDomain().getName() != null) {
      return false;
    }
    if (getVersionNumber() != that.getVersionNumber()) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = getDomain().getName() != null ? getDomain().getName().hashCode() : 0;
    result = 31 * result + getVersionNumber();
    return result;
  }
}