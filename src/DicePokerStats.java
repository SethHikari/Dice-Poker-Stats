/**
 * Copyright 2011 Tony Miller

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */


public class DicePokerStats {
	/**
	 * This program rolls every possible 5 dice combination the prints the stats
	 * about it
	 * 
	 * @param args
	 *            none really
	 */
	public static void main(String[] args) {
		System.out.println("Rolling 5 dice for you...");
		DiceRoller roller = new DiceRoller();
		roller.printAllStats();
	}

}
