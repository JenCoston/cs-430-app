package locations;

import java.util.Collections;

public class Concordia extends Location {
	private static Concordia t;
	
	private Concordia() {
		super("Concordia", "A lush forest that surrounds a pristine palace courtyard.");
	}
	
	public static Concordia getConcordia() {
		if (t==null)
			t = new Concordia();
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
    public void clueList(){
    	int numClues = 10;
		for (int i=0; i< numClues; i++) {
			clueList.add(clues(i));
		}
		Collections.shuffle(clueList);
    }
	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "The greenery surrounding the murder place is lush.";
    			break;
    	case 2: clue = "At the crime scene there is heavy cloud coverage.";
    			break;
    	case 3: clue = "The murder site has a very nice palatial estate.";
    			break;
    	case 4: clue = "Small bushes surround the palace of the crime scene.";
    			break;
    	case 5: clue = "The palace of the murder site has many windows in which to have had witnesses to the crime.";
    			break;
    	case 6: clue = "Maybe in your spare time check out the courtyard of the crime scene.";
    			break;
    	case 7: clue = "There is a great walking trail at the scene of the crime.";
    			break;
    	case 8: clue = "The palace almost melts in to the background of the murder scene.";
    			break;
    	case 9: clue = "The sky surrounding the crime scene is always painted with beautiful shades of blue and purple.";
    			break;
    	case 10: clue = "You might get lost in the palace of this crime site.";
    			break;
    	}
		return clue;
	}
}
