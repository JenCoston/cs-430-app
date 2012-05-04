package locations;

import java.util.Collections;

public class Pacifica extends Location {
	private static Pacifica t;
	
	private Pacifica() {
		super("Pacifica", "A dark and lonely nation in the west");
	}
	
	public static Pacifica getPacifica() {
		if (t==null)
			t = new Pacifica();
		return t;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "The land of the crime scene seems to be very stark.";
    			break;
    	case 2: clue = "There is report that when entering the murder site, no estate is in view.";
    			break;
    	case 3: clue = "Dark and dreary is the murder site.";
    			break;
    	case 4: clue = "The place of the murder site is very urban.";
    			break;
    	case 5: clue = "The streets that roam the land of the crime scene are bare.";
    			break;
    	case 6: clue = "Don’t get lost in this crime scene you might forget which building you were in.";
    			break;
    	case 7: clue = "Maybe the next block over from the murder site would be helpful.";
    			break;
    	case 8: clue = "Avoid stepping on cracks at this scene of the murder to save your mother’s back.";
    			break;
    	case 9: clue = "There is plenty of light at this scene of the crime.";
    			break;
    	case 10: clue = "The sky is the perfect dusk to conceal clues at this murder site.";
    			break;
    	}
		return clue;
	}
	
	@Override
    public void clueList(){
    	int numClues = 10;
		for (int i=0; i< numClues; i++) {
			clueList.add(clues(i));
		}
		Collections.shuffle(clueList);
    }
}
