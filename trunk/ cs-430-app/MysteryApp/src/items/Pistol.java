package items;

import java.util.Collections;

import com.android.mysteryApp.R;


public class Pistol extends Item {
	public Pistol() {
		super("Pistol", "A special weapon issued only to Keyserian officials", R.drawable.gun_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "Be careful how you handle this item.";
    			break;
    	case 2: clue = "I think there was a loud sound during the incident.";
    			break;
    	case 3: clue = "The murder made use of some natural resources.";
    			break;
    	case 4: clue = "I wouldn’t go hunting without this item.";
    			break;
    	case 5: clue = "The light will reflect off this murder weapon.";
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
