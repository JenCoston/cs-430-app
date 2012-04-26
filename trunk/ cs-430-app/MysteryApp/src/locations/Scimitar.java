package locations;

public class Scimitar extends Location {
	private static Scimitar t;
	
	private Scimitar() {
		super("Scimitar", "A vast nation surrounded by a guardian wall");
	}
	
	public static Scimitar getScimitar() {
		if (t==null)
			t = new Scimitar();
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
    	case 2: clue = "I’ve heard there is a structure surrounding the kingdom of the crime scene.";
    			break;
    	case 3: clue = "There is report that when entering the murder site, no estate is in view.";
    			break;
    	case 4: clue = "Follow the windy road on your way to where the murder took place.";
    			break;
    	case 5: clue = "The murder site seems like a steep area to live in.";
    			break;
    	case 6: clue = "This crime scene has something that China thought was only unique to it.";
    			break;
    	case 7: clue = "The sky is barely seen at the site of the crime.";
    			break;
    	case 8: clue = "There is a great walking trail at the scene of the crime.";
    			break;
    	case 9: clue = "The wolf can blow down the front of this crime scene. ";
    			break;
    	case 10: clue = "What keeps you out might be keeping secrets in at the scene of the crime.";
    			break;
    	}
		return clue;
	}

}
