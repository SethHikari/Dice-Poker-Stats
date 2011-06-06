import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DicePokerStats {
	private static long mTotalRolls;
	private static int mRepeatedDice;

	/**
	 * This program rolls every possible 5 dice combination the prints the stats
	 * about it
	 * 
	 * @param args
	 *            none really
	 */
	public static void main(String[] args) {
		System.out.println("Rolling 5 dice for you...");
		List<List<Integer>> allRolls = roll5Dice();
		statsOfDoubles(allRolls);
		statsOfTriples(allRolls);
		statsOf4OfAKind(allRolls);
		statsOf5OfAKind(allRolls);
		statsOf2Pairs(allRolls);
	}

	/**
	 * Creates a list of every possible 5 dice combination, and how many
	 * combinations that was
	 * 
	 * @return list of all possible dice rolls
	 */
	private static List<List<Integer>> roll5Dice() {
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
		mTotalRolls = countPossibleRolls;
		System.out.println("The amount of possible dice rolls: "
				+ countPossibleRolls);
		return rollList;
	}

	/**
	 * counts the amount of doubles in the whole list and prints the output
	 * 
	 * @param allRolls
	 *            a double array of rolls, and size ok
	 */
	private static void statsOfDoubles(List<List<Integer>> allRolls) {
		long doubleCount = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 2)) {
				doubleCount++;
			}
		}
		System.out.println("The amount of doubles in all the rolls possible: "
				+ doubleCount);
		System.out.println("So the chance of rolling doubles is: "
				+ ((double) doubleCount / (double) mTotalRolls) * 100d + " %");
	}

	private static void statsOfTriples(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 3)) {
				count++;
			}
		}
		System.out.println("The amount of triples in all the rolls possible: "
				+ count);
		System.out.println("So the chance of rolling triples is: "
				+ ((double) count / (double) mTotalRolls) * 100d + " %");
	}

	private static void statsOf4OfAKind(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 4)) {
				count++;
			}
		}
		System.out
				.println("The amount of 4 of a kind in all the rolls possible: "
						+ count);
		System.out.println("So the chance of rolling 4 of a kind is: "
				+ ((double) count / (double) mTotalRolls) * 100d + " %");
	}

	private static void statsOf5OfAKind(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 5)) {
				count++;
			}
		}
		System.out
				.println("The amount of 5 of a kind in all the rolls possible: "
						+ count);
		System.out.println("So the chance of rolling 5 of a kind is: "
				+ ((double) count / (double) mTotalRolls) * 100d + " %");
	}

	private static void statsOf2Pairs(List<List<Integer>> allRolls) {
		long count = 0;
		for (List<Integer> roll : allRolls) {
			if (hasMultiplesOf(roll, 2)) {
				roll.removeAll(Arrays.asList(mRepeatedDice));
				if(hasMultiplesOf(roll, 2)) {
					count++;
				}
			}
		}
		System.out
				.println("The amount of 2 pairs in all the rolls possible: "
						+ count);
		System.out.println("So the chance of rolling 2 pairs is: "
				+ ((double) count / (double) mTotalRolls) * 100d + " %");
	}

	private static boolean hasMultiplesOf(List<Integer> roll, int amount) {
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
