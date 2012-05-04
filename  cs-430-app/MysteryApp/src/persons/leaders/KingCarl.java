package persons.leaders;

import java.util.Collections;

import persons.Leader;
import persons.activities.King;
import locations.Keyser;


public class KingCarl extends Leader {
	private static KingCarl t;
	
	private KingCarl() {
		super("King Carl",
				"The enlightened despot of Keyser",
				Keyser.getKeyser(),
				King.class,
				"Greetings.  Do you know anyone good at solving mysteries?",
				"To the charriot!",
			    "My chief of staff has assured me that everything is in order. There is nothing for you to see here.",
			    "This land has a long vast history of hosting parties! Killing the guests would dampen the mood.",
			    "If people knew all the fun we have, they would shut us down!",
			    "I'm so popular and so fun... why wouldn't I win?"

		);
	}
	
	public static KingCarl getKingCarl() {
		if (t==null)
			t = new KingCarl();
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
    	case 3: clue = "The greenery surrounding the suspect’s home land is lush.";
    			break;
    	case 4: clue = "The foot prints found near the site resembles boot tread.";
    			break;
    	case 5: clue = "A sketch of the suspect reveals a very long chin.";
    			break;
    	case 6: clue = "A shred of pinkish purple cloth was found during the initial investigation.";
    			break;
    	case 7: clue = "It was rumored that the whites of their eyes could not even be seen.";
    			break;
    	case 8: clue = "A light colored hair was found attached to the murder weapon.";
    			break;
    	case 9: clue = "A photograph of a nearby palatial estate was found fluttering in the wind.";
    			break;
    	case 10: clue = "The crook was said to have facial hair.";
    			break;
    	}
		return clue;
	}
	
	   public void clueList(){
	    	int numClues = 10;
			for (int i=0; i< numClues; i++) {
				clueList.add(clues(i));
			}
			Collections.shuffle(clueList);
	    }
}
