/**
 * Copyright 2012 plista GmbH  (http://www.plista.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 */

package org.plista.kornakapi.core;

/** implementation of {@link Candidate}, note that the framework will reuse this instance */
public class MutableCandidate implements Candidate {

  private String label;
  private long itemID;

  public void set(String label, long itemID) {
    this.label = label;
    this.itemID = itemID;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public long getItemID() {
    return itemID;
  }

}
