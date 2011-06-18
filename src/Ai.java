import java.util.ArrayList;
import java.util.List;


public class Ai {
	private List<Integer> mDice;
	private List<List<Integer>> mDiceList;

	public Ai() {
		
	}
	
	public void setDice(List<Integer> dice) {
		mDice = dice;
	}
	
	public List<Integer> testing4Dice() {
		List<List<Integer>> tempDiceList = create4(mDice);
		float highestScore = 0f;
		List<Integer> bestDice = null;
		for (List<Integer> dice : tempDiceList) {
			DiceRoller roller = new DiceRoller(dice.get(0), dice.get(1), dice.get(2), dice.get(3));
			roller.buildStats();
			float score = roller.getScore();
			if(score > highestScore) {
				highestScore = score;
				bestDice = dice;
			}
		}
		return bestDice;
	}
	
	public List<List<Integer>> create4(List<Integer> dice) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		for(int i = 0; i < dice.size(); i++) {
			List<Integer> includedPermutation = new ArrayList<Integer>();
			for(int j = 0; j < dice.size(); j++) {
				if(i!=j) {
					includedPermutation.add(dice.get(j));
				}
			}
			permutations.add(includedPermutation);
		}
		
		return permutations;
	}

}
