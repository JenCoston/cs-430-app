package items;

import com.android.mysteryApp.R;

public class Poison extends Item {
	public Poison() {
		super("Poison", "A deadly concoction known only to Wallaby chemists", R.drawable.poison_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "Be careful how you handle this item.";
    			break;
    	case 2: clue = "I bet it was easy to conceal this weapon.";
    			break;
    	case 3: clue = "Wonder where the murderer had to go to get this item.";
    			break;
    	case 4: clue = "I’m sure no one saw this weapon coming.";
    			break;
    	case 5: clue = "The silence in this item is something to be talked about.";
    			break;
    	}
		return clue;
	}
}
