package persons.states;

import java.util.ArrayList;

import persons.NonPlayer;

public class NonPlayerState {
	private int state;
	private ArrayList<String> dialog;
	private NonPlayer np;
	
	public NonPlayerState(NonPlayer np) {
		this.np = np;
		state = 0;
		dialog = new ArrayList<String>();
	}
}
