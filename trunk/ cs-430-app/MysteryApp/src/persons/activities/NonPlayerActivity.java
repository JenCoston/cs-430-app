package persons.activities;

import persons.NonPlayer;
import persons.Player;

import com.android.mysteryApp.Map;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public abstract class NonPlayerActivity extends Activity {
	private NonPlayer np;
	private int smallImgId;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
	
	protected void setNonPlayerFields(NonPlayer np, int smallImgId) {
		this.np = np;
		this.smallImgId = smallImgId;
	}
    
    
    public void charTalk(View view){
    	showDialog(np.converse(), 3000);
    	if (np.isInteresting())
    		np.perform(getApplicationContext());//may need to get a return value, etc
    }
    
    public void giveItem(View view){   
        if (np.wantsItem()) {
        	if (Player.getPlayer().hasItem(np.getWantedItem()))
        		showDialog("I need an item and you have it- test dialog...", 3000);
        	else
        		showDialog("I need an item and you don't have it - test dialog...", 3000);
        }
        else {
        	showDialog("I don't need any items right now.", 3000);
        }
    }
    
    public void returnMap(View view){  
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);
    }
    
	private void showDialog(String message, int milliseconds)
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
