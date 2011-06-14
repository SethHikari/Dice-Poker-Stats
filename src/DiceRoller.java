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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceRoller {
	private static long mTotalPossibleRolls;
	private List<List<Integer>> mRollList;
	private int mRepeatedDice;
	private long m5KindPossible;
	private long m4KindPossible;
	private long m3KindPossible;
	private long m2KindPossible;
	private long mFullHousePossible;
	private long m2PairPossible;

	public DiceRoller() {
		mRollList = roll5Dice();
	}
	
	public DiceRoller(int dice1) {
		List<List<Integer>> roll4List = roll4Dice();
		for (List<Integer> roll : roll4List){
			roll.add(dice1);
		}
		mRollList = roll4List;
	}

	public DiceRoller(int dice1, int dice2) {
		List<List<Integer>> roll3List = roll3Dice();
		for (List<Integer> roll : roll3List){
			roll.add(dice1);
			roll.add(dice2);
		}
		mRollList = roll3List;
	}
	
	public DiceRoller(int dice1, int dice2, int dice3) {
		List<List<Integer>> roll2List = roll2Dice();
		for (List<Integer> roll : roll2List){
			roll.add(dice1);
			roll.add(dice2);
			roll.add(dice3);
		}
		mRollList = roll2List;
	}
	
	public DiceRoller(int dice1, int dice2, int dice3, int dice4) {
		List<List<Integer>> roll1List = roll1Dice();
		for (List<Integer> roll : roll1List){
			roll.add(dice1);
			roll.add(dice2);
			roll.add(dice3);
			roll.add(dice4);
		}
		mRollList = roll1List;
	}

	/**
	 * Creates a list of every possible 5 dice combination, and how many
	 * combinations that was
	 * 
	 * @return list of all possible dice rolls
	 */
	protected List<List<Integer>> roll5Dice() {
		long countPossibleRolls = 0;
		// create a list to keep the dice rolls in
		List<List<Integer>> rollList = new ArrayList<List<Integer>>();

		// loop through every possible roll
		for (int dice1 = 1; dice1 <= 6; dice1++) {
			for (int dice2 = 1; dice2 <= 6; dice2++) {
				for (int dice3 = 1; dice3 <= 6; dice3++) {
					for (int dice4 = 1; dice4 <= 6; dice4++) {
						for (int dice5 = 1; dice5 <= 6; dice5++) {
							// add to the list a new double array of all the
							// dice so far
							List<Integer> roll = new ArrayList<Integer>();
							roll.add(dice1);
							roll.add(dice2);
							roll.add(dice3);
							roll.add(dice4);
							roll.add(dice5);
							rollList.add(roll);
							countPossibleRolls++;
						}
					}
				}
			}
		}
		mTotalPossibleRolls = countPossibleRolls;
		System.out.println("The amount of possible dice rolls: "
				+ countPossibleRolls);
		return rollList;
	}
	
	protected List<List<Integer>> roll4Dice() {
		long countPossibleRolls = 0;
		// create a list to keep the dice rolls in
		List<List<Integer>> rollList = new ArrayList<List<Integer>>();
		// loop through every possible roll
		
			for (int dice2 = 1; dice2 <= 6; dice2++) {
				for (int dice3 = 1; dice3 <= 6; dice3++) {
					for (int dice4 = 1; dice4 <= 6; dice4++) {
						for (int dice5 = 1; dice5 <= 6; dice5++) {
							// add to the list a new double array of all the
							// dice so far
							List<Integer> roll = new ArrayList<Integer>();
							roll.add(dice2);
							roll.add(dice3);
							roll.add(dice4);
							roll.add(dice5);
							rollList.add(roll);
							countPossibleRolls++;
						}
					}
				}
			}
		mTotalPossibleRolls = countPossibleRolls;
		System.out.println("The amount of possible dice rolls: "
				+ countPossibleRolls);
		return rollList;
	}

	protected List<List<Integer>> roll3Dice() {
		long countPossibleRolls = 0;
		// create a list to keep the dice rolls in
		List<List<Integer>> rollList = new ArrayList<List<Integer>>();

		// loop through every possible roll
		for (int dice3 = 1; dice3 <= 6; dice3++) {
			for (int dice4 = 1; dice4 <= 6; dice4++) {
				for (int dice5 = 1; dice5 <= 6; dice5++) {
					// add to the list a new double array of all the
					// dice so far
					List<Integer> roll = new ArrayList<Integer>();
					roll.add(dice3);
					roll.add(dice4);
					roll.add(dice5);
					rollList.add(roll);
					countPossibleRolls++;
				}
			}
		}

		mTotalPossibleRolls = countPossibleRolls;
		System.out.println("The amount of possible dice rolls: "
				+ countPossibleRolls);
		return rollList;
	}
	
	protected List<List<Integer>> roll2Dice() {
		long countPossibleRolls = 0;
		// create a list to keep the dice rolls in
		List<List<Integer>> rollList = new ArrayList<List<Integer>>();

		// loop through every possible roll
			for (int dice4 = 1; dice4 <= 6; dice4++) {
				for (int dice5 = 1; dice5 <= 6; dice5++) {
					// add to the list a new double array of all the
					// dice so far
					List<Integer> roll = new ArrayList<Integer>();
					roll.add(dice4);
					roll.add(dice5);
					rollList.add(roll);
					countPossibleRolls++;
				}
			}


		mTotalPossibleRolls = countPossibleRolls;
		System.out.println("The amount of possible dice rolls: "
				+ countPossibleRolls);
		return rollList;
	}

	protected List<List<Integer>> roll1Dice() {
		long countPossibleRolls = 0;
		// create a list to keep the dice rolls in
		List<List<Integer>> rollList = new ArrayList<List<Integer>>();

		// loop through every possible roll
				for (int dice5 = 1; dice5 <= 6; dice5++) {
					// add to the list a new double array of all the
					// dice so far
					List<Integer> roll = new ArrayList<Integer>();
					roll.add(dice5);
					rollList.add(roll);
					countPossibleRolls++;
				}


		mTotalPossibleRolls = countPossibleRolls;
		System.out.println("The amount of possible dice rolls: "
				+ countPossibleRolls);
		return rollList;
	}
	
	public void printAllStats() {
		statsOf5OfAKind(mRollList);
		statsOf4OfAKind(mRollList);
		statsOfFullHouse(mRollList);
		statsOf2Pairs(mRollList);
		statsOfTriples(mRollList);
		statsOfDoubles(mRollList);
		statsOfStrait(mRollList);
	}

	public void statsOf5OfAKind(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 5)) {
				count++;
			}
		}
		m5KindPossible = count;
		System.out
				.println("\nThe amount of 5 of a kind in all the rolls possible: "
						+ m5KindPossible);
		System.out.println("So the chance of rolling 5 of a kind is: "
				+ ((double) m5KindPossible / (double) mTotalPossibleRolls)
				* 100d + " %");
	}

	public void statsOf4OfAKind(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 4)) {
				count++;
			}
		}
		m4KindPossible = count - m5KindPossible;
		System.out
				.println("\nThe amount of 4 of a kind in all the rolls possible: "
						+ m4KindPossible);
		System.out.println("So the chance of rolling 4 of a kind is: "
				+ ((double) m4KindPossible / (double) mTotalPossibleRolls)
				* 100d + " %");
	}

	public void statsOfFullHouse(List<List<Integer>> allRolls) {
		long count = 0;
		long debug = 0;
		List<List<Integer>> rolls = new ArrayList<List<Integer>>(allRolls);
		for (List<Integer> rollToCopy : rolls) {
			List<Integer> roll = new ArrayList<Integer>(rollToCopy);
			if (roll.size() < 5) {
				debug++;
			}
			if (hasMultiplesOf(roll, 3)) {
				roll.removeAll(Arrays.asList(mRepeatedDice));
				if (hasMultiplesOf(roll, 2)) {
					count++;
				}
			}
		}
		mFullHousePossible = count;
		System.out
				.println("\nThe amount of Full Houses in all the rolls possible: "
						+ mFullHousePossible);
		System.out.println("So the chance of rolling a Full House is: "
				+ ((double) mFullHousePossible / (double) mTotalPossibleRolls)
				* 100d + " %");
	}

	public void statsOf2Pairs(List<List<Integer>> allRolls) {
		long count = 0;
		long debug = 0;
		List<List<Integer>> rolls = new ArrayList<List<Integer>>(allRolls);
		for (List<Integer> rollToCopy : rolls) {
			List<Integer> roll = new ArrayList<Integer>(rollToCopy);
			if (roll.size() < 5) {
				debug++;
			}
			if (hasMultiplesOf(roll, 2)) {
				roll.removeAll(Arrays.asList(mRepeatedDice));
				if (hasMultiplesOf(roll, 2)) {
					count++;
				}
			}
		}
		m2PairPossible = count - mFullHousePossible;
		System.out.println("\nThe amount of 2 pairs in all the rolls possible: "
				+ m2PairPossible);
		System.out.println("So the chance of rolling 2 pairs is: "
				+ ((double) m2PairPossible / (double) mTotalPossibleRolls)
				* 100d + " %");
	}

	public void statsOfTriples(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 3)) {
				count++;
			}
		}
		m3KindPossible = count - m4KindPossible;
		System.out.println("\nThe amount of triples in all the rolls possible: "
				+ m3KindPossible);
		System.out.println("So the chance of rolling triples is: "
				+ ((double) m3KindPossible / (double) mTotalPossibleRolls)
				* 100d + " %");
	}

	public void statsOfDoubles(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 2)) {
				count++;
			}
		}
		m2KindPossible = count - m3KindPossible;
		System.out.println("\nThe amount of doubles in all the rolls possible: "
				+ m2KindPossible);
		System.out.println("So the chance of rolling doubles is: "
				+ ((double) m2KindPossible / (double) mTotalPossibleRolls)
				* 100d + " %");

	}

	public void statsOfStrait(List<List<Integer>> allRolls) {
		long count = 0;

		for (int go = 1; go <= 2; go++) {
			for (List<Integer> roll : allRolls) {
				int bCount = 0;
				for (int i = go; i <= go + 4; i++) {
					boolean a = false;

					for (int dice : roll) {
						if (dice == i) {
							a = true;
						}
					}

					if (a) {
						bCount++;
					}
				}
				if (bCount == 5) {
					count++;
				}
			}
		}
		System.out
				.println("\nThe amount of small straits in all the rolls possible: "
						+ count);
		System.out
				.println("So the chance of rolling a Small Strait is: "
						+ ((double) count / (double) mTotalPossibleRolls)
						* 100d + " %");

	}

	private boolean hasMultiplesOf(List<Integer> roll, int amount) {
		for (int i = 0; i < roll.size(); i++) {
			int duplicates = 0;

			for (int j = i + 1; j < roll.size(); j++) {
				if (roll.get(i) == roll.get(j)) {
					duplicates++;
					if (duplicates >= amount - 1) {
						mRepeatedDice = roll.get(i);
						return true;
					}
				}
			}
		}
		return false;
	}
}
