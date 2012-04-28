package persons.leaders;

import persons.Leader;
import persons.activities.PrimeMinister;
import locations.Peoria;

public class PrimeMinisterPatrick extends Leader {
	private static PrimeMinisterPatrick t;
	
	private PrimeMinisterPatrick() {
		super("Prime Minister Patrick",
				"Peoria's esteemed leader",
				Peoria.getPeoria(),
				PrimeMinister.class,
				"Pleased to meet you... any chance you are a detective?",
				"I'll help if I can.",
				"It is frightening that something like this could happen in this day and age!",
				"I suppose someone can't be too carefull."
		);
	}
		
	public static PrimeMinisterPatrick getPrimeMinisterPatrick() {
		if (t==null)
			t = new PrimeMinisterPatrick();
		return t;
	}

	@Override
	public String clues(int n) {
		String clue = null;
    	switch(n){
    	case 1: clue = "The culprit was said to be wearing something on their head.";
    			break;
    	case 2: clue = "The suspect hails from a land with water.";
    			break;
    	case 3: clue = "The foot prints found near the site resembles boot tread.";
    			break;
    	case 4: clue = "The land that the suspect hails from seems to be very stark.";
    			break;
    	case 5: clue = "A sketch of the suspect reveals a very long chin.";
    			break;
    	case 6: clue = "A medal was found at the scene of the crime.";
    			break;
    	case 7: clue = "The wanted signs posted around the land show a suspect with squinty eyes.";
    			break;
    	case 8: clue = "There is report that when entering the offender’s home soil, their estate is not in view.";
    			break;
    	case 9: clue = "The empire where the culprit comes from is said to be very urban.";
    			break;
    	case 10: clue = "The rogue was reported to be so talkative that their mouth was never seen closed.";
    			break;
    	}
		return clue;
	}

}
