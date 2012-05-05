package items;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Item {
	private String name;
	private String desc;
	private int smallImgId;
	protected ArrayList<String> clueList = new ArrayList<String>();
	private static int i = 0;
	
	public Item(String name, String desc, int smallImgId) {
		this.name = name;
		this.desc = desc;
		this.smallImgId = smallImgId;
		clueList();
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
	
    public abstract void clueList();
    
    public String getClue(){
    	String c;
    	if(i < clueList.size()){
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
    
    public ArrayList<String> getClueList(){
    	return clueList;
    }

}
