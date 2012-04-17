package persons.states;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import persons.NonPlayer;

public abstract class NonPlayerState extends Activity implements StateConstants {
	private int id;
	private NonPlayer np;//only needed for succes or failure??
	private String sayBefore;
	
	public NonPlayerState(int id, NonPlayer np, String sayBefore) {
		this.id = id;
		this.np = np;
		this.sayBefore = sayBefore;
	}
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	public abstract boolean execute(Context context);//call startActivityWithResult in here??
	
	public NonPlayerState execute() {
		return this;
	}
	
	public int getId() {
		return id;
	}
	
	public String getSayBefore() {
		return sayBefore;
	}
	
	//public void success(boolean){}
	
}
