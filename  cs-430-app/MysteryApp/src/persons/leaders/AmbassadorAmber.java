package persons.leaders;

import java.util.Collections;

import persons.Leader;
import persons.activities.Ambassador;
import locations.Ambrosia;

public class AmbassadorAmber extends Leader {
	private static AmbassadorAmber t;
		
	private AmbassadorAmber() {
		super("Ambassador Amber", 
				"A dignified Ambrosian leader",
				Ambrosia.getAmbrosia(),
				Ambassador.class,
				"Good day!  Quite a mess, this murder bit.",
				"I hope they don't try to pin me to this murder!",
				"My land is far too safe for an incident like this to happen here.",
				"Do you have any leads?"
		);
	}
		
	public static AmbassadorAmber getAmbassadorAmber() {
		if (t==null)
			t = new AmbassadorAmber();
		return t;
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "A red hair was found at the scene of the crime.";
    			break;
    	case 2: clue = "The suspect hails from a land with water.";
    			break;
    	case 3: clue = "The greenery surrounding the suspect’s home land is lush.";
    			break;
    	case 4: clue = "I’ve heard that the culprit comes from a place with heavy cloud coverage.";
    			break;
    	case 5: clue = "A shred of pinkish purple cloth was found during the initial investigation.";
    			break;
    	case 6: clue = "Wide eyes sparkled during the night of the crime.";
    			break;
    	case 7: clue = "Small footprints were found in the ground running away from the murder site.";
    			break;
    	case 8: clue = "A photograph of a nearby palatial estate was found fluttering in the wind. ";
    			break;
    	case 9: clue = "A feather was found clinging to the murder weapon.";
    			break;
    	case 10: clue = "The suspect is most likely asking for your help.";
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
