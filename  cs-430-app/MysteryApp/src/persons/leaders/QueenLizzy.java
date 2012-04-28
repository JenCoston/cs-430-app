package persons.leaders;

import persons.Leader;
import persons.activities.Queen;
import locations.Edenborough;

public class QueenLizzy extends Leader {
	private static QueenLizzy t;
		
	private QueenLizzy() {
		super("Queen Lizzy",
				"Her royal highness of Edenborough",
				Edenborough.getEdenborough(),
				Queen.class,
				"Oh dear what a shame this is!",
				"Oh me, Oh my!",
				"I simply cannot imagine this happening on our soil.",
				"Please do your best to sort this out!"
		);
	}
		
	public static QueenLizzy getQueenLizzy() {
		if (t==null)
			t = new QueenLizzy();
		return t;
	}

	@Override
	public String clues(int n) {
		String clue = null;
    	switch(n){
    	case 1: clue = "A red hair was found at the scene of the crime.";
    			break;
    	case 2: clue = "The culprit was said to be wearing something on their head.";
    			break;
    	case 3: clue = "The suspect hails from a land with water.";
    			break;
    	case 4: clue = "The greenery surrounding the suspect’s home land is lush.";
    			break;
    	case 5: clue = "I’ve heard that the culprit comes from a place with heavy cloud coverage.";
    			break;
    	case 6: clue = "A shred of pinkish purple cloth was found during the initial investigation.";
    			break;
    	case 7: clue = "It was rumored that the whites of their eyes could not even be seen.";
    			break;
    	case 8: clue = "A photograph of a nearby palatial estate was found fluttering in the wind.";
    			break;
    	case 9: clue = "A feather was found clinging to the murder weapon.";
    			break;
    	case 10: clue = "The suspect is most likely asking for your help.";
    			break;
    	}
		return clue;
	}

}
