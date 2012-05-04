package items;

import java.util.Collections;

import com.android.mysteryApp.R;

public class Fire extends Item {
	public Fire() {
		super("Fire", "A blaze fueled by Dislexia's most advanced accelerant", R.drawable.fire_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "This weapon spreads like crazy.";
    			break;
    	case 2: clue = "A very temperamental item.";
    			break;
    	case 3: clue = "This murder weapon brings light to the case.";
    			break;
    	case 4: clue = "The murder made use of some natural resources.";
    			break;
    	case 5: clue = "This item has probably been used for many other tasks besides murder.";
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
