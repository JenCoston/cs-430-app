package persons.leaders;

import persons.Leader;
import persons.activities.President;
import locations.Pacifica;


public class PresidentPaul extends Leader {
	private static PresidentPaul t;
	
	private PresidentPaul() {
		super("President Paul",
				"The charismatic chief executive of Pacifica",
				Pacifica.getPacifica(),
				President.class,
				"Well hello there!  Now what do you think of all this?",
				"Don't worry, I will find out who the culprit is!",
				"Well I certainly wasn't involved."
		);
	}
	
	public static PresidentPaul getPresidentPaul() {
		if (t==null)
			t = new PresidentPaul();
		return t;
	}

	@Override
	public String clues(int n) {
		String clue = null;
    	switch(n){
    	case 1: clue = "The land that the suspect hails from seems to be very stark.";
    			break;
    	case 2: clue = "A tie tack was found at the scene of the crime.";
    			break;
    	case 3: clue = "The wanted signs posted around the land show a suspect with squinty eyes.";
    			break;
    	case 4: clue = "A light colored hair was found attached to the murder weapon.";
    			break;
    	case 5: clue = "There is report that when entering the offender’s home soil, their estate is not in view.";
    			break;
    	case 6: clue = "The buzz on the crooks kingdom is dark and dreary.";
    			break;
    	case 7: clue = "The suspect is most likely asking for your help.";
    			break;
    	case 8: clue = "The scoundrel will most likely assert that he was not involved.";
    			break;
    	case 9: clue = "The empire where the culprit comes from is said to be very urban.";
    			break;
    	case 10: clue = "The rogue was reported to be so talkative that their mouth was never seen closed.";
    			break;
    	}
		return clue;
	}

}
