package items;

import com.android.mysteryApp.R;

public class Gavel extends Item {
	public Gavel() {
		super("Gavel", "The mark of Scimitarian leaders", R.drawable.mallet_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "This item might be heavy to lug around.";
    			break;
    	case 2: clue = "This murder weapon is a heavy hitter.";
    			break;
    	case 3: clue = "Justice will be brought by this item.";
    			break;
    	case 4: clue = "This item is the missing piece to the puzzle.";
    			break;
    	case 5: clue = "Let’s hope we can nail down this case with this murder weapon.";
    			break;
    	}
		return clue;
	}
}
