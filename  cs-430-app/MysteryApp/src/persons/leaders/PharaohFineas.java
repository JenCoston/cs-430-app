package persons.leaders;

import java.util.Collections;

import persons.Leader;
import persons.activities.Pharaoh;
import locations.Wallaby;

public class PharaohFineas extends Leader {
	private static PharaohFineas t;
	
	private PharaohFineas() {
		super("Pharaoh Fineas",
				"The stoic Wallabian head of state",
				Wallaby.getWallaby(),
				Pharaoh.class,
				"Hello. I hope you can assist us.",
				"It's too warm out here, can we please talk in my pyramid!",
				"I am just glad it wasn't me.",
				"It is high time someone solves this case."
		);
	}
		
	public static PharaohFineas getPharaohFineas() {
		if (t==null)
			t = new PharaohFineas();
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
    	case 3: clue = "A sketch of the suspect reveals a very long chin.";
    			break;
    	case 4: clue = "Wide eyes sparkled during the night of the crime.";
    			break;
    	case 5: clue = "I’ve heard that the culprit comes from a place with heavy cloud coverage.";
    			break;
    	case 6: clue = "There is report that when entering the offender’s home soil, their estate is not in view.";
    			break;
    	case 7: clue = "The suspect is most likely asking for your help.";
    			break;
    	case 8: clue = "The scoundrel will most likely assert that he was not involved.";
    			break;
    	case 9: clue = "I bet the crook has an incriminating shocked look about them.";
    			break;
    	case 10: clue = "I’ve heard whispers that the murder was wearing dress or robe attire.";
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
