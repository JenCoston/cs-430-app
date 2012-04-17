package persons.states;

import java.util.Random;

import persons.NonPlayer;

public class NonPlayerStateFactory {
	private Random rand;
	private NonPlayerStateFactory itemFactory;
	private int tempCurr;
	
	public NonPlayerStateFactory() {
		rand = new Random();
		tempCurr = 0;
	}
	
	public NonPlayerState getNextState(NonPlayer interestingNP) {
		NonPlayerState result;
		switch (tempCurr) {
			case 0:
				result =  new WantItemState(interestingNP, "Rope");
				break;
			case 1:
				result = new RiddleState(interestingNP, "", "");
				break;
			case 2:
				result = new WantItemState(interestingNP, "Pistol");
				break;
			case 3:
				result =  new RiddleState(interestingNP, "", "");
				break;
			case 4:
				result = new WantItemState(interestingNP, "Poison");
				break;
			default:
				result = new RiddleState(interestingNP, "", "");
		}
		tempCurr++;
		return result;
	}
}
