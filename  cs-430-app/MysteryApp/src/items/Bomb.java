package items;

import java.util.Collections;

import com.android.mysteryApp.R;

public class Bomb extends Item {
	public Bomb() {
		super("Bomb", "A deadly Peoriorian explosive", R.drawable.bomb2_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "Be careful how you handle this item.";
    			break;
    	case 2: clue = "I think there was a loud sound during the incident.";
    			break;
    	case 3: clue = "This is one bundle you do not want to find.";
    			break;
    	case 4: clue = "This murder weapon really sparkles.";
    			break;
    	case 5: clue = "It wasn’t even the 4th of July when this weapon was used.";
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
