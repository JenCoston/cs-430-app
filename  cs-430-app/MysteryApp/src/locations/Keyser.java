package locations;

public class Keyser extends Location {
	private static Keyser t;
	
	private Keyser() {
		super("Keyser", "A densely forested kingdom with many rivers");
	}
	
	public static Keyser getKeyser() {
		if (t==null)
			t = new Keyser();
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
    	case 3: clue = "The murder site has a very nice palatial estate.";
    			break;
    	case 4: clue = "The trees will sway back and forth at murder site.";
    			break;
    	case 5: clue = "The water might have reflected the culprit during the criminal deed.";
    			break;
    	case 6: clue = "If the trees grow anymore, you might lose the palace of this crime scene.";
    			break;
    	case 7: clue = "The sky at this crime site is gray with shades of blue.";
    			break;
    	case 8: clue = "You might have to paddle to reach the palace of this crime scene.";
    			break;
    	case 9: clue = "There are many types of plants located at the scene of the crime.";
    			break;
    	case 10: clue = "The palace soars as high as the trees at this crime site.";
    			break;
    	}
		return clue;
	}
}
