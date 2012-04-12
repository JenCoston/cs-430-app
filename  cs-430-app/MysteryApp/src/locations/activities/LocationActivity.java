package locations.activities;

import locations.Location;

import com.android.mysteryApp.Load;
import com.android.mysteryApp.Map;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public abstract class LocationActivity extends Activity {
	private Location l;
	private int backImgId;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
	
	public void setLocationFields(Location l, int backImgId) {
		this.l = l;
		this.backImgId = backImgId;
	}
	
	public abstract void explorePlace(View view);
	    
	public void gatherItem(View view){   
		// Resume a Saved Game
		Intent i = new Intent(getApplicationContext(), Load.class);
		startActivity(i);
	}

	/*public void returnMM(View view){  
		// Return to Main Menu
		Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
		startActivity(i);
	}*/
	
	public void returnToMap(View view) {
		//Return to map
		Intent i = new Intent(getApplicationContext(), Map.class);
		startActivity(i);
	}
	
	protected void showDialog(String message, int milliseconds, int smallImgId) {
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
