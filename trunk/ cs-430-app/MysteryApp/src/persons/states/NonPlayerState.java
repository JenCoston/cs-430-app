package persons.states;

import android.content.Context;
import persons.NonPlayer;

public abstract class NonPlayerState {
	private int id;
	private NonPlayer np;
	private String sayBefore;
	
	public NonPlayerState(int id, NonPlayer np, String sayBefore) {
		this.id = id;
		this.np = np;
		this.sayBefore = sayBefore;
	}
	
	public abstract boolean Execute(Context context);//call startActivityWithResult in here??
	
	public int getId() {
		return id;
	}
	
	public String getSayBefore() {
		return sayBefore;
	}
	
	//public void success(boolean){}
	
}
