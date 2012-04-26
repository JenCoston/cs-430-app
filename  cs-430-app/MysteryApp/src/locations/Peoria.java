package locations;

public class Peoria extends Location {
	private static Peoria t;
	
	private Peoria() {
		super("Peoria", "A lively nation with uptown feel.");
	}
	
	public static Peoria getPeoria() {
		if (t==null)
			t = new Peoria();
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
    	case 2: clue = "The land of the crime scene seems to be very stark.";
    			break;
    	case 3: clue = "There is report that when entering the murder site, no estate is in view.";
    			break;
    	case 4: clue = "The place of the murder site is very urban.";
    			break;
    	case 5: clue = "There is a fast exit plan that zooms away from the crime scene.";
    			break;
    	case 6: clue = "Let the light be your guide to this murder site.";
    			break;
    	case 7: clue = "The darkness of the sky is spooky at this crime scene.";
    			break;
    	case 8: clue = "This crime site has a very unique architectural flare.";
    			break;
    	case 9: clue = "There may be something extra in the tower at this crime scene.";
    			break;
    	case 10: clue = "There might be something to reading at the scene of the crime.";
    			break;
    	}
		return clue;
	}

}
