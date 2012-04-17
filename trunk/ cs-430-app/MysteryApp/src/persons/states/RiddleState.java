package persons.states;

import com.android.mysteryApp.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import persons.NonPlayer;
import puzzles.RiddlePuzzle;

public class RiddleState extends NonPlayerState implements RiddleStrings, StateConstants {
	private String riddle;
	private String answer;
	
	public RiddleState(NonPlayer np, String riddle, String answer) {
		super(RIDDLE_STATE, np, "See if you can figure this out...");
	}
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean execute(Context context) {
		// TODO WILL PUT PUZZLE ACTIVITY HERE
		Intent i = new Intent(context, RiddlePuzzle.class);
		startActivity(i);
		return false;
	}
	
}
