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

import java.io.IOException;
import java.util.Set;

/**
 * Info about a given host's view of a domain.
 */
public interface HostDomain extends Comparable<HostDomain> {
  public Domain getDomain();

  public Set<HostDomainPartition> getPartitions() throws IOException;

  public HostDomainPartition getPartitionByNumber(int partNum) throws IOException;

  public HostDomainPartition addPartition(int partNum, int initialVersion) throws IOException;

  public boolean isDeletable() throws IOException;

  public void setDeletable(boolean deletable) throws IOException;

  public void delete() throws IOException;
}
