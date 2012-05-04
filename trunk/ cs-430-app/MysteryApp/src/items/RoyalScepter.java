package items;

import java.util.Collections;

import com.android.mysteryApp.R;


public class RoyalScepter extends Item {
	public RoyalScepter() {
		super("Royal Scepter", "An ornate staff belonging to a Concordian offical", R.drawable.staff2_sm);
	}

	@Override
	public String clues(int n) {
    	String clue = null;
    	switch(n){
    	case 1: clue = "No one saw this item as a death weapon.";
    			break;
    	case 2: clue = "This murder weapon has some ornate detail.";
    			break;
    	case 3: clue = "This item has probably been used for other tasks besides murder.";
    			break;
    	case 4: clue = "Justice will be brought by this item.";
    			break;
    	case 5: clue = "This item can appoint the murderer.";
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
