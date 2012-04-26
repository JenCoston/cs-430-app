package locations;

public class Dislexia extends Location {
	private static Dislexia t;
	
	private Dislexia() {
		super("Dislexia", "A bleak and cold country");
	}
	
	public static Dislexia getDislexia() {
		if (t==null)
			t = new Dislexia();
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
    	case 2: clue = "Dark and dreary is the murder site.";
    			break;
    	case 3: clue = "There is a way to tell the time of incident at the crime scene.";
    			break;
    	case 4: clue = "The streets that roam the land of the crime scene are bare.";
    			break;
    	case 5: clue = "No leaves will be found blowing around in the wind at this murder site.";
    			break;
    	case 6: clue = "You will be hard pressed to find someone to talk to you in this neighborhood of the crime scene.";
    			break;
    	case 7: clue = "There is a unique window perfect for looking out onto the crime scene.";
    			break;
    	case 8: clue = "The detail on the prime building near the murder site cannot be mistaken.";
    			break;
    	case 9: clue = "The sky surrounding the crime scene is always painted with beautiful shades of blue and purple.";
    			break;
    	case 10: clue = "There may be something extra in the tower at this crime scene.";
    			break;
    	}
		return clue;
	}
}
