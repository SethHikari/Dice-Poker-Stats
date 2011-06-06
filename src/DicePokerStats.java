import java.util.ArrayList;
import java.util.List;

public class DicePokerStats {
	private static long mTotalRolls;

	/**
	 * This program rolls every possible 5 dice combination the prints the stats
	 * about it
	 * 
	 * @param args
	 *            none really
	 */
	public static void main(String[] args) {
		System.out.println("Rolling 5 dice for you...");
		List<int[]> allRolls = roll5Dice();
		statsOfDoubles(allRolls);
		statsOfTriples(allRolls);
		statsOf4OfAKind(allRolls);
		statsOf5OfAKind(allRolls);
	}

	/**
	 * Creates a list of every possible 5 dice combination, and how many
	 * combinations that was
	 * 
	 * @return list of all possible dice rolls
	 */
	private static List<int[]> roll5Dice() {
		long countPossibleRolls = 0;
		// create a list to keep the dice rolls in
		List<int[]> rollList = new ArrayList<int[]>();

		// loop through every possible roll
		for (int dice1 = 1; dice1 <= 6; dice1++) {
			for (int dice2 = 1; dice2 <= 6; dice2++) {
				for (int dice3 = 1; dice3 <= 6; dice3++) {
					for (int dice4 = 1; dice4 <= 6; dice4++) {
						for (int dice5 = 1; dice5 <= 6; dice5++) {
							// add to the list a new double array of all the
							// dice so far
							rollList.add(new int[] { dice1, dice2, dice3,
									dice4, dice5 });
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
	 * @param rollList
	 *            a double array of rolls, and size ok
	 */
	private static void statsOfDoubles(List<int[]> rollList) {
		long doubleCount = 0;
		for (int[] roll : rollList) {
			if (hasMultiplesOf(roll, 2)) {
				doubleCount++;
			}
		}
		System.out.println("The amount of doubles in all the rolls possible: "
				+ doubleCount);
		System.out.println("So the chance of rolling doubles is: "
				+ ((double) doubleCount / (double) mTotalRolls) * 100d + " %");
	}

	/**
	 * check to see if the roll has any doubles
	 * 
	 * @param roll
	 *            a double array, any size of dice rolls, lol any dice too
	 * @return whether it contains a double
	 */
	/*private static boolean hasDouble(int[] roll) {
		int size = roll.length;

		for (int i = 0; i < size; i++) {
			for (int a = i + 1; a < size; a++) {
				if (roll[i] == roll[a]) {
					return true;
				}
			}
		}
		return false;
	}*/
	
	private static void statsOfTriples(List<int[]> rollList) {
		long count = 0;
		for (int[] roll : rollList) {
			if (hasMultiplesOf(roll, 3)) {
				count++;
			}
		}
		System.out.println("The amount of triples in all the rolls possible: "
				+ count);
		System.out.println("So the chance of rolling triples is: "
				+ ((double) count / (double) mTotalRolls) * 100d + " %");
	}
	
	private static void statsOf4OfAKind(List<int[]> rollList) {
		long count = 0;
		for (int[] roll : rollList) {
			if (hasMultiplesOf(roll, 4)) {
				count++;
			}
		}
		System.out.println("The amount of 4 of a kind in all the rolls possible: "
				+ count);
		System.out.println("So the chance of rolling 4 of a kind is: "
				+ ((double) count / (double) mTotalRolls) * 100d + " %");
	}
	
	private static void statsOf5OfAKind(List<int[]> rollList) {
		long count = 0;
		for (int[] roll : rollList) {
			if (hasMultiplesOf(roll, 5)) {
				count++;
			}
		}
		System.out.println("The amount of 5 of a kind in all the rolls possible: "
				+ count);
		System.out.println("So the chance of rolling 5 of a kind is: "
				+ ((double) count / (double) mTotalRolls) * 100d + " %");
	}
	
	/*private static boolean hasTriple( int [] array ) {
	      Map<Integer, Integer > map = new HashMap<Integer, Integer>();
	      int count;
	      for ( int index = 0; index < array.length; index++ ) {
	         Integer total = map.get(array[ index ]);
	         if ( total == null ) {
	            count = 1;
	         }
	         else {
	            count = total.intValue() + 1;
	            if ( count >= 3 ) {
	               return true;
	            }
	         }
	         map.put( array[ index ], count );
	      }

	      return false;
	   }*/
	 
	 private static boolean hasMultiplesOf(int[] roll,int amount) {
		    for (int i = 0; i < roll.length; i++){
		        int duplicates = 0;

		        for (int j = i+1; j < roll.length; j++){
		            if (roll[i] == roll[j]) {
		                duplicates++;
		                if (duplicates >= amount - 1) return true;
		            }
		        }
		    }
		    return false;
		}

}
