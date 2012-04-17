package puzzles;

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

public class PuzzleActivity extends Activity{
	
	protected int id;
	
	public void returnToMap(View view) {
		//Return to map
		Intent i = new Intent(getApplicationContext(), Map.class);
		startActivity(i);
	}
	
	public void submitAnswer(View view){
	      //plain text input
        final EditText plain_edit_text = (EditText) this.findViewById(R.id.editText1);
        String reponse = plain_edit_text.getText().toString();
        if(Riddles.getRiddles().correct(reponse, id)){
        	showDialog("Congratulations! This time!", 3000, R.drawable.bomb_sm);
        }
        else{
        	showDialog("Too bad ", 3000, R.drawable.bomb_sm);
        }
	}
	
	public void showDialog(String message, int milliseconds, int smallImgId)
	{
		// show message
		Toast dialog = Toast.makeText(
				getApplicationContext(),
				message,
				Toast.LENGTH_LONG);

		dialog.setGravity(Gravity.CENTER, 0, 0);
		LinearLayout dialogView = (LinearLayout) dialog.getView();
		ImageView coolImage = new ImageView(getApplicationContext());
		coolImage.setImageResource(smallImgId);
		dialogView.addView(coolImage, 0);
		dialog.setDuration(milliseconds);
		dialog.show();
	}

}
