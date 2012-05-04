package persons.leaders;

import java.util.Collections;

import persons.Leader;
import persons.activities.Sultan;
import locations.Scimitar;

public class SultanSam extends Leader {
	private static SultanSam t;
	
	private SultanSam() {
		super("Sultan Sam",
				"The Scimitar governing head",
				Scimitar.getScimitar(),
				Sultan.class,
				"Greetings.  We could use some help sorting this out.",
				"Ask Abu!",
				"Sultans rule the Arab world, so why not the rest?",
				"That little viper? Don't you know to kill a snake you have to chop off its head?",
				"I have my ways to take care of trouble."
		);
	}
		
	public static SultanSam getSultanSam() {
		if (t==null)
			t = new SultanSam();
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
    	case 5: clue = "It was rumored that the whites of their eyes could not even be seen.";
    			break;
    	case 6: clue = "A light colored hair was found attached to the murder weapon.";
    			break;
    	case 7: clue = "Small footprints were found in the ground running away from the murder site.";
    			break;
    	case 8: clue = "I’ve heard there is a structure surrounding the kingdom.";
    			break;
    	case 9: clue = "There is report that when entering the offender’s home soil, their estate is not in view.";
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
