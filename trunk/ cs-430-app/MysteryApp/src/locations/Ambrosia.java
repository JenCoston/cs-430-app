package locations;

public class Ambrosia extends Location {
	private static Ambrosia t;
	
	private Ambrosia() {
		super("Ambrosia", "A beautful region on a large lake");
	}
	
	public static Ambrosia getAmbrosia() {
		if (t==null)
			t = new Ambrosia();
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
    	case 6: clue = "The palace of the murder site has many windows in which to have had witnesses to the crime.";
    			break;
    	case 7: clue = "Follow the windy road on your way to where the murder took place.";
    			break;
    	case 8: clue = "The water might have reflected the culprit during the criminal deed.";
    			break;
    	case 9: clue = "A unique roof to the palace is seen at the place of the crime.";
    			break;
    	case 10: clue = "Be sure to check the tallest tower for clues at this scene of the crime.";
    			break;
    	}
		return clue;
	}
}
