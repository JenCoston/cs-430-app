package persons.states;

import android.content.Context;
import persons.NonPlayer;

public class RiddleState extends NonPlayerState implements RiddleStrings, StateConstants {
	private String riddle;
	private String answer;
	
	public RiddleState(NonPlayer np, String riddle, String answer) {
		super(RIDDLE_STATE, np, "See if you can figure this out...");
	}

	@Override
	public boolean execute(Context context) {
		// TODO WILL PUT PUZZLE ACTIVITY HERE
		return false;
	}
	
}
