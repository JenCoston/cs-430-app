package items;

import java.util.Collections;

import com.android.mysteryApp.R;

public class Dagger extends Item {
	public Dagger() {
		super("Dagger", "A small but sharp Edenboroughian blade", R.drawable.knife_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "A much more common murder weapon.";
    			break;
    	case 2: clue = "I’m sure this weapon was easy to hide.";
    			break;
    	case 3: clue = "This item has probably been used for many other tasks besides murder.";
    			break;
    	case 4: clue = "The light will reflect off this murder weapon.";
    			break;
    	case 5: clue = "The grip on this item is rather small.";
    			break;
    	}
		return clue;
	}
	
    public void clueList(){
    	int numClues = 10;
		for (int i=0; i< numClues; i++) {
			clueList.add(clues(i));
		}
		Collections.shuffle(clueList);
    }
}
