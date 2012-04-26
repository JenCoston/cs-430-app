package items;

import com.android.mysteryApp.R;

public class Staff extends Item {
	public Staff() {
		super("Staff", "A long, ornate Ambroisan staff", R.drawable.staff_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "No one saw this item as a death weapon.";
    			break;
    	case 2: clue = "This item sparkles as a murder weapon.";
    			break;
    	case 3: clue = "This item can appoint the murderer.";
    			break;
    	case 4: clue = "I bet this item was hard to conceal.";
    			break;
    	case 5: clue = "This item is never scene without its other half of the set.";
    			break;
    	}
		return clue;
	}
}
