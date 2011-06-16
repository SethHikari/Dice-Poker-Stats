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
	private long mStraitPossible;
	private float mScore = 0f;

	public DiceRoller() {
		mRollList = roll5Dice();
	}

	public DiceRoller(int dice1) {
		List<List<Integer>> roll4List = roll4Dice();
		for (List<Integer> roll : roll4List) {
			roll.add(dice1);
		}
		mRollList = roll4List;
	}

	public DiceRoller(int dice1, int dice2) {
		List<List<Integer>> roll3List = roll3Dice();
		for (List<Integer> roll : roll3List) {
			roll.add(dice1);
			roll.add(dice2);
		}
		mRollList = roll3List;
	}

	public DiceRoller(int dice1, int dice2, int dice3) {
		List<List<Integer>> roll2List = roll2Dice();
		for (List<Integer> roll : roll2List) {
			roll.add(dice1);
			roll.add(dice2);
			roll.add(dice3);
		}
		mRollList = roll2List;
	}

	public DiceRoller(int dice1, int dice2, int dice3, int dice4) {
		List<List<Integer>> roll1List = roll1Dice();
		for (List<Integer> roll : roll1List) {
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
		printStats(m5KindPossible, statsOf5OfAKind(mRollList), "5 of a Kind");
		printStats(m4KindPossible, statsOf4OfAKind(mRollList), "4 of a Kind");

		System.out.println("\nThis role has a score chance of: " + mScore);
	}

	public void printStats(long possible, float chance, String scoreType) {
		System.out.println("\nThe amount of " + scoreType + " in all the rolls pssible: " + possible);
		System.out.println("So the chance of rolling " + scoreType + " is: " + chance * 100f + "%");
	}

	public float statsOf5OfAKind(List<List<Integer>> allRolls) {
		float value = 7f;
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 5)) {
				count++;
			}
		}

		m5KindPossible = count;
		float chance = (float) m5KindPossible / (float) mTotalPossibleRolls;
		mScore = mScore + (chance * value);

		return chance;
	}

	public float statsOf4OfAKind(List<List<Integer>> allRolls) {
		float value = 6f;
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 4)) {
				count++;
			}
		}

		m4KindPossible = count - m5KindPossible;
		float chance = (float) m4KindPossible / (float) mTotalPossibleRolls;
		mScore = mScore + (chance * value);

		return chance;
	}

	public float statsOfFullHouse(List<List<Integer>> allRolls) {
		float value = 4f;
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
		float chance = (float) mFullHousePossible / (float) mTotalPossibleRolls;
		mScore = mScore + (chance * value);

		return chance;
	}

	public float statsOf2Pairs(List<List<Integer>> allRolls) {
		float value = 2f;
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
		float chance = (float) m2PairPossible / (float) mTotalPossibleRolls;
		mScore = mScore + (chance * value);

		return chance;
	}

	public float statsOfTriples(List<List<Integer>> allRolls) {
		float value = 3f;
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 3)) {
				count++;
			}
		}

		m3KindPossible = count - m4KindPossible;
		float chance = (float) m3KindPossible / (float) mTotalPossibleRolls;
		mScore = mScore + (chance * value);

		return chance;
	}

	public float statsOfDoubles(List<List<Integer>> allRolls) {
		float value = 1f;
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 2)) {
				count++;
			}
		}

		m2KindPossible = count - m3KindPossible;
		float chance = (float) m2KindPossible / (float) mTotalPossibleRolls;
		mScore = mScore + (chance * value);

		return chance;

	}

	public float statsOfStrait(List<List<Integer>> allRolls) {
		float value = 5f;
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

		mStraitPossible = count;
		float chance = (float) mStraitPossible / (float) mTotalPossibleRolls;
		mScore = mScore + (chance * value);

		return chance;

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
