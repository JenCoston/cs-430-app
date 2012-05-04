package puzzle.games;

import android.app.Activity;
import android.os.Bundle;

public class GameActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Numbers game = new Numbers();
		game.runNumbers(this);
	}
}
