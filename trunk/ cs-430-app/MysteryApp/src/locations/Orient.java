package locations;

public class Orient extends Location {
	private static Orient t;
	
	private Orient() {
		super("Orient", "A storied land with a gated kingdom.");
	}
	
	public static Orient getOrient() {
		if (t==null)
			t = new Orient();
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
    	case 1: clue = "The greenery surrounding the murder place is lush.";
    			break;
    	case 2: clue = "The murder site has a very nice palatial estate.";
    			break;
    	case 3: clue = "I’ve heard there is a structure surrounding the kingdom of the crime scene.";
    			break;
    	case 4: clue = "The palace of the murder site has many windows in which to have had witnesses to the crime.";
    			break;
    	case 5: clue = "A unique roof to the palace is seen at the place of the crime.";
    			break;
    	case 6: clue = "The entrance is very grand at this crime site.";
    			break;
    	case 7: clue = "If the trees grow anymore, you might lose the palace of this crime scene.";
    			break;
    	case 8: clue = "There are certain hours that the palace of the murder site might be hard to get into.";
    			break;
    	case 9: clue = "The grounds of the palace seem rather bare at the site of the crime.";
    			break;
    	case 10: clue = "The darkness of the sky is spooky at this crime scene. ";
    			break;
    	}
		return clue;
	}

}
