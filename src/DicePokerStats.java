import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		DiceRoller roller;
		
		System.out.print("Enter number of dice you have kept out of 5: ");
		Scanner scan = new Scanner(System.in);
		int numberOfDice = scan.nextInt();
		if(numberOfDice == 4){
			System.out.println("\nPlease enter those dice hitting return after each entry:");
			int dice1 = scan.nextInt();
			int dice2 = scan.nextInt();
			int dice3 = scan.nextInt();
			int dice4 = scan.nextInt();
			
			roller = new DiceRoller(dice1, dice2, dice3, dice4);
		} else if(numberOfDice == 3) {
			System.out.println("\nPlease enter those dice hitting return after each entry:");
			int dice1 = scan.nextInt();
			int dice2 = scan.nextInt();
			int dice3 = scan.nextInt();
			
			roller = new DiceRoller(dice1, dice2, dice3);
		}
		else if(numberOfDice == 2) {
			System.out.println("\nPlease enter those dice hitting return after each entry:");
			int dice1 = scan.nextInt();
			int dice2 = scan.nextInt();
			
			roller = new DiceRoller(dice1, dice2);
		} else if(numberOfDice == 1) {
			System.out.println("\nPlease enter those dice hitting return after each entry:");
			int dice1 = scan.nextInt();
			
			roller = new DiceRoller(dice1);
		}
		else {
			roller = new DiceRoller();
		}
		
		roller.printAllStats();
		
		Ai ai = new Ai();
		List<Integer> dice = new ArrayList<Integer>();
		dice.add(5);
		dice.add(5);
		dice.add(1);
		dice.add(1);
		dice.add(2);
		ai.create4(dice);
	}

}
