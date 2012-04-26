package persons.leaders;

import clues.Clue;
import persons.Leader;
import locations.Orient;


public class EmperorEddy extends Leader {
	private static EmperorEddy t;
	
	private EmperorEddy() {
		super("Emperor Eddy",
				"Orient's fearless ruler",
				Orient.getOrient(),
				"Hello.  What a complication this is!",
				"Excuse me but it's about time for the cricket match!",
			    "What emperor could be without his empire? I know I won't be.",
			    "Emperors have a long and vast tradition as rulers of LARGE areas of land. What could be larger than the world?",
			    "Everyone knows that the emperors hold the highest title in the land. My guru gave me his personal assurance that I will win."
		);
	}
	
	public static EmperorEddy getEmperorEddy() {
		if (t==null)
			t = new EmperorEddy();
		return t;
	}

	@Override
	public String clues(int n) {
		String clue = null;
    	switch(n){
    	case 1: clue = "It was rumored that the culprit was seen with an item in their hand.";
    			break;
    	case 2: clue = "The culprit was said to be wearing something on their head.";
    			break;
    	case 3: clue = "The greenery surrounding the suspect’s home land is lush.";
    			break;
    	case 4: clue = "A shred of pinkish purple cloth was found during the initial investigation.";
    			break;
    	case 5: clue = "The wanted signs posted around the land show a suspect with squinty eyes.";
    			break;
    	case 6: clue = "Small footprints were found in the ground running away from the murder site.";
    			break;
    	case 7: clue = "A photograph of a nearby palatial estate was found fluttering in the wind.";
    			break;
    	case 8: clue = "I’ve heard there is a structure surrounding the kingdom.";
    			break;
    	case 9: clue = "The buzz on the crooks kingdom is dark and dreary.";
    			break;
    	case 10: clue = "The villain is probably dominant, tough, and self asserted.";
    			break;
    	}
		return clue;
	}

}
