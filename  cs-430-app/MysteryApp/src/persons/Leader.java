package persons;

import java.util.ArrayList;
import java.util.Collections;

import persons.activities.NonPlayerActivity;
import locations.Location;

public abstract class Leader extends NonPlayer {
	
	private ArrayList<String> clueList;
	private static int i = 0;
	
	public Leader(String name, String desc, Location location, Class<? extends NonPlayerActivity> cl, String... choices) {
		super(name, desc, location, cl, choices);
	}
	
	public abstract String clues(int n);
	
    public void clueList(){
    	int numRiddles = 10;
		for (int i=0; i< numRiddles; i++) {
			clueList.add(clues(i));
		}
		Collections.shuffle(clueList);
    }

    public String getClue(){
    	String c;
    	if(i <= 9){
			c = clueList.get(i);
			i++;
		}
		else{
			i = 0;
			Collections.shuffle(clueList);
			c = clueList.get(i);
		}
    	return c;
    }
}
