/*Copyright 2012 Jean-Louis PASTUREL 
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*  limitations under the License.
*/
package jlp.helper;

import java.util.HashMap;

public class Counters {
	private HashMap<String, Double[]> hmCount;
	private int sizeTab;
	private String[] names;

	public HashMap<String, Double[]> getHmCount() {
		return hmCount;
	}

	public void setHmCount(HashMap<String, Double[]> hmCount) {
		this.hmCount = hmCount;
	}

	public int getSizeTab() {
		return sizeTab;
	}

	public void setSizeTab(int sizeTab) {
		this.sizeTab = sizeTab;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public Counters(int sizeTab) {
		super();
		hmCount = new HashMap<String, Double[]>();
		this.sizeTab = sizeTab;
		names = new String[sizeTab];
	}

}
