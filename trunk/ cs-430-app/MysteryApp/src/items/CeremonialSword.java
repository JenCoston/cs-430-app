package items;

import com.android.mysteryApp.R;


public class CeremonialSword extends Item {
	public CeremonialSword() {
		super("Ceremonial Sword", "An blade carried by Oriental leaders", R.drawable.sword_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "The light will reflect off this murder weapon.";
    			break;
    	case 2: clue = "This item sparkles as a murder weapon.";
    			break;
    	case 3: clue = "A good grip had to be taken for this item.";
    			break;
    	case 4: clue = "Some are more skilled with this weapon then others.";
    			break;
    	case 5: clue = "I bet it is hard to conceal this weapon.";
    			break;
    	}
		return clue;
	}
}
