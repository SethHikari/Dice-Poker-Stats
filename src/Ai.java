import java.util.ArrayList;
import java.util.List;

public class Ai {
	private List<Integer> mDice;

	public Ai() {

	}

	public void setDice(List<Integer> dice) {
		mDice = dice;
	}

	public List<Integer> testingDice() {
		List<List<Integer>> tempDiceList = create3(mDice);
		float highestScore = 0f;
		List<Integer> bestDice = null;
		for (List<Integer> dice : tempDiceList) {
			DiceRoller roller = new DiceRoller(dice.get(0), dice.get(1), dice
					.get(2));
			roller.buildStats();
			float score = roller.getScore();
			if (score > highestScore) {
				highestScore = score;
				bestDice = dice;
			}
		}
		return bestDice;
	}

	public List<List<Integer>> create4(List<Integer> dice) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		for (int i = 0; i < dice.size(); i++) {
			List<Integer> includedPermutation = new ArrayList<Integer>();
			for (int j = 0; j < dice.size(); j++) {
				if (i != j) {
					includedPermutation.add(dice.get(j));
				}
			}
			permutations.add(includedPermutation);
		}

		return permutations;
	}

	public List<List<Integer>> create3(List<Integer> dice) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		for (int i = 0; i < dice.size(); i++) {
			for (int j = i + 1; j < dice.size(); j++) {
				List<Integer> includedPermutation = new ArrayList<Integer>();
				for (int k = 0; k < dice.size(); k++) {
					if (k != i && k != j) {
						includedPermutation.add(dice.get(k));
					}
				}
				permutations.add(includedPermutation);
			}

		}

		return permutations;

	}

	public List<List<Integer>> create2(List<Integer> dice) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		for (int i = 0; i < dice.size(); i++) {
			for (int j = i + 1; j < dice.size(); j++) {
				for (int k = j + 1; k < dice.size(); k++) {
					List<Integer> includedPermutation = new ArrayList<Integer>();
					for (int l = 0; l < dice.size(); l++) {
						if (l != i && l != j && l != k) {
							includedPermutation.add(dice.get(k));
						}
					}
					permutations.add(includedPermutation);
				}

			}
		}

		return permutations;

	}

	public List<List<Integer>> create1(List<Integer> dice) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		for (int di : dice) {
			List<Integer> includedPermutation = new ArrayList<Integer>();
			includedPermutation.add(di);
			permutations.add(includedPermutation);
		}
		return permutations;
	}
}
