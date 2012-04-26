package persons.leaders;

import clues.Clue;
import persons.Leader;
import locations.Concordia;

public class ChancellorChuck extends Leader {
	private static ChancellorChuck t;
		
	private ChancellorChuck() {
		super("Chancellor Chuck",
				"Condordia's beloved executive",
				Concordia.getConcordia(),
				"What a dreadful deed that has been done!",
				"Its not my fault!",
				"Nothing like this could happen on my watch!",
				"Only the strong survive, I suppose."
		);
	}
		
	public static ChancellorChuck getChancellorChuck() {
		if (t==null)
			t = new ChancellorChuck();
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
    	case 4: clue = "The foot prints found near the site resembles boot tread.";
    			break;
    	case 5: clue = "I’ve heard that the culprit comes from a place with heavy cloud coverage.";
    			break;
    	case 6: clue = "A sketch of the suspect reveals a very long chin.";
    			break;
    	case 7: clue = "A medal was found at the scene of the crime.";
    			break;
    	case 8: clue = "The wanted signs posted around the land show a suspect with squinty eyes.";
    			break;
    	case 9: clue = "A photograph of a nearby palatial estate was found fluttering in the wind.";
    			break;
    	case 10: clue = "The villain is probably dominant, tough, and self asserted.";
    			break;
    	}
		return clue;
	}

}

