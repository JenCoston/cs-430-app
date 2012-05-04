package persons.leaders;

import java.util.Collections;

import persons.Leader;
import persons.activities.Dictator;
import locations.Dislexia;


public class DictatorDave extends Leader {
	private static DictatorDave t;
	
	private DictatorDave() {
		super("Dictator Dave",
				"The sole holder of Dislexian authority",
				Dislexia.getDislexia(),
				Dictator.class,
				"Interesting situation here...",
				"Did you ask some of the common folk!",
				"Me? Corrupt? Hardly!",
				"People say there is nothing I won't do to gain power, but I have to draw the line somewhere."
		);
	}
	
	public static DictatorDave getDictatorDave() {
		if (t==null)
			t = new DictatorDave();
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
    	case 3: clue = "A sketch of the suspect reveals a very long chin.";
    			break;
    	case 4: clue = "Wide eyes sparkled during the night of the crime.";
    			break;
    	case 5: clue = "The buzz on the crooks kingdom is dark and dreary.";
    			break;
    	case 6: clue = "The villain is probably dominant, tough, and self asserted.";
    			break;
    	case 7: clue = "The scoundrel will most likely assert that he was not involved.";
    			break;
    	case 8: clue = "The empire where the culprit comes from is said to be very urban.";
    			break;
    	case 9: clue = "I bet the crook has an incriminating shocked look about them.";
    			break;
    	case 10: clue = "The foot prints are said to be rather large surrounding the crime scene.";
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
