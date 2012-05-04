package locations;

import java.util.Collections;

public class Edenborough extends Location {
	private static Edenborough t;
	
	private Edenborough() {
		super("Edenborough", "A proud land with a magnificant body of water.");
	}
	
	public static Edenborough getEdenborough() {
		if (t==null)
			t = new Edenborough();
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
    	case 1: clue = "The scene of the crime is a land with water.";
    			break;
    	case 2: clue = "The greenery surrounding the murder place is lush.";
    			break;
    	case 3: clue = "At the crime scene there is heavy cloud coverage.";
    			break;
    	case 4: clue = "The murder site has a very nice palatial estate.";
    			break;
    	case 5: clue = "Small bushes surround the palace of the crime scene.";
    			break;
    	case 6: clue = "The trees will sway back and forth at murder site.";
    			break;
    	case 7: clue = "A unique roof to the palace is seen at the place of the crime.";
    			break;
    	case 8: clue = "The water might have reflected the culprit during the criminal deed.";
    			break;
    	case 9: clue = "Be careful of which entrance you take at the murder site.";
    			break;
    	case 10: clue = "You might have to paddle to reach the palace of this crime scene.";
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
