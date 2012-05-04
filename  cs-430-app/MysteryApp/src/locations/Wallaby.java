package locations;

import java.util.Collections;


public class Wallaby extends Location {
	private static Wallaby t;
	
	private Wallaby() {
		super("Wallaby", "A warm state with pyramids lining the outskirts ");
	}
	
	public static Wallaby getWallaby() {
		if (t==null)
			t = new Wallaby();
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
    	case 1: clue = "At the crime scene there is heavy cloud coverage.";
    			break;
    	case 2: clue = "There is report that when entering the murder site, no estate is in view.";
    			break;
    	case 3: clue = "At this crime scene you will see for miles. ";
    			break;
    	case 4: clue = "You’re not going to find much water here at this site of the crime.";
    			break;
    	case 5: clue = "The terrain is much differed in this crime scene.";
    			break;
    	case 6: clue = "The sparse green might whisper in the wind at this murder site. ";
    			break;
    	case 7: clue = "You might have to check out these geometric shapes for clues at the scene of the crime.";
    			break;
    	case 8: clue = "Avoid stepping on cracks at this scene of the murder to save your mother’s back.";
    			break;
    	case 9: clue = "You might want to find a resourceful mode of transportation to travel this crime site.";
    			break;
    	case 10: clue = "The beautiful linear shades of blue sky line this murder scene.";
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
