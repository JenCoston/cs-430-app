package persons.states;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import persons.NonPlayer;
import puzzles.PicturePuzzle;

public class PuzzleState extends NonPlayerState {
	
	public PuzzleState(NonPlayer np, String sayBefore) {
		super(PUZZLE_STATE, np, "See if you can crack this puzzle...");
	}
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean execute(Context context) {
		// TODO WILL PUT PUZZLE ACTIVITY HERE
		Intent i = new Intent(context, PicturePuzzle.class);
		startActivity(i);
		return false;
	}
	
}
