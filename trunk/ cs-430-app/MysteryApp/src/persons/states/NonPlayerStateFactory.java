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
		/*switch (tempCurr) {
			case 0:
				result =  new PuzzleState(interestingNP, "");
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
			case 5:
				result = new PuzzleState(interestingNP, "");
				break;
			default:
				result = new RiddleState(interestingNP, "", "");
		}
		tempCurr++;*/
		int curr = rand.nextInt(3);
		switch (curr) {
			case 0:
				result =  new PuzzleState(interestingNP, "");
				break;
			case 1:
				result = new RiddleState(interestingNP, "", "");
				break;
			case 2:
				result = getRandomWantItemState(interestingNP);
				break;
			default:
				result = new RiddleState(interestingNP, "", "");
		}
		return result;
	}
	
	private WantItemState getRandomWantItemState(NonPlayer interestingNP) {
		WantItemState w;
		int choice = rand.nextInt(10);
		switch (choice) {
			case 0:
				w =  new WantItemState(interestingNP, "Poison");
				break;
			case 1:
				w =  new WantItemState(interestingNP, "Bomb");
				break;
			case 2:
				w =  new WantItemState(interestingNP, "Ceremonial Sword");
				break;
			case 3:
				w =  new WantItemState(interestingNP, "Royal Scepter");
				break;
			case 4:
				w =  new WantItemState(interestingNP, "Dagger");
				break;
			case 5:
				w =  new WantItemState(interestingNP, "Fire");
				break;
			case 6:
				w =  new WantItemState(interestingNP, "Gavel");
				break;
			case 7:
				w =  new WantItemState(interestingNP, "Rope");
				break;
			case 8:
				w =  new WantItemState(interestingNP, "Staff");
				break;
			case 9:
				w =  new WantItemState(interestingNP, "Pistol");
				break;
			default:
				w =  new WantItemState(interestingNP, "Poison");
		}
		return w;
	}
}
