package items;

import com.android.mysteryApp.R;


public class Rope extends Item {
	public Rope() {
		super("Rope", "Pacifican rope neckwear", R.drawable.rope1_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "I bet it was easy to conceal this weapon.";
    			break;
    	case 2: clue = "The silence in this item is something to be talked about.";
    			break;
    	case 3: clue = "The murder had to be close to use this item.";
    			break;
    	case 4: clue = "Let’s hope this item helps to unravel this mystery.";
    			break;
    	case 5: clue = "Let’s hope we don’t have a hung jury.";
    			break;
    	}
		return clue;
	}
}
