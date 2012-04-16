package locations.activities;

import persons.Player;
import items.Item;
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
		if (l.hasItems()) {
			Item item = l.getOnlyItem();//a test function for demo purposes
			showDialog("You found the "+item.getName()+" - "+item.getDescription()+".", 3000, item.getSmallImgId());
			Player.getPlayer().addItems(item);
			l.removeItem(item.getName());
		}
		else
			showDialog("There are no items here.", 3000, backImgId);
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
