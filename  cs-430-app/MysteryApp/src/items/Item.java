package items;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Item {
	private String name;
	private String desc;
	private int smallImgId;
	private ArrayList<String> clueList;
	private static int i = 0;
	
	public Item(String name, String desc, int smallImgId) {
		this.name = name;
		this.desc = desc;
		this.smallImgId = smallImgId;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return desc;
	}

	public int getSmallImgId() {
		return smallImgId;
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
