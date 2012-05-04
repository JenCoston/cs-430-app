package puzzles;

import game.Story;

import com.android.mysteryApp.Map;
import com.android.mysteryApp.R;

import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public abstract class PuzzleActivity extends Activity{
	
	protected int id;
	
	public void returnToMap(View view) {
		//Return to map
		Intent i = new Intent(getApplicationContext(), Map.class);
		startActivity(i);
	}
	
	public abstract void submitAnswer(View view);
	
	public void showDialog(String message, int milliseconds)
	{
		// show message
		Toast dialog = Toast.makeText(
				getApplicationContext(),
				message,
				Toast.LENGTH_LONG);

		dialog.setGravity(Gravity.CENTER, 0, 0);
		LinearLayout dialogView = (LinearLayout) dialog.getView();
		dialog.setDuration(milliseconds);
		dialog.show();
	}

}
