package locations.activities;

import puzzles.RiddlePuzzle;
import persons.NonPlayer;
import persons.Player;
import items.Item;
import locations.Location;

import com.android.mysteryApp.Map;
import com.android.mysteryApp.Menu;
import com.android.mysteryApp.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
		if (l.hasItems()) {
			Item item = l.getOnlyItem();//a test function for demo purposes
			showDialog("You found the "+item.getName()+" - "+item.getDescription()+".", 3000, item.getSmallImgId());
			Player.getPlayer().addItems(item);
			l.removeItem(item.getName());
		}
		else
			showDialog("There are no items here.", 3000, backImgId);
	}
	
	public void exploreMulti(View view) {
		//get character list in place
		final NonPlayer[] npcs = l.getNonPlayers();
		int len = npcs.length;
		final CharSequence[] npcChoices = new CharSequence[len];
		for (int i=0; i<len; i++)
			npcChoices[i] = npcs[i].getName();
		//show the new dialog type
		if (len < 2) {
			explorePlace(null);
		}
		else {
        	AlertDialog.Builder builder = new AlertDialog.Builder(this);
        	builder.setTitle("Speak to whom?");
        	builder.setItems(npcChoices, new DialogInterface.OnClickListener() {
        		public void onClick(DialogInterface dialog, int choice) {
        			//Intent characterIntent = newCharacterIntentFactory(npcChoices[choice].toString());
        			NonPlayer curr = npcs[choice];
        			showDialog(curr.getName() + ": " + curr.getDescription(), 3000, R.drawable.president1_head);
        			Intent characterIntent = npcs[choice].getIntent(getApplicationContext());
        			startActivity(characterIntent);
        			//Toast.makeText(getApplicationContext(), npcChoices[choice], Toast.LENGTH_LONG).show();
        		}
        	});
        	AlertDialog alert = builder.create();
        	alert.show();
        }
	}
	
	public void playGame(View view){
		Intent i = new Intent(getApplicationContext(), RiddlePuzzle.class);
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
	
	public void openMenu(View view) {
		Intent i =new Intent(getApplicationContext(), Menu.class);
		startActivity(i);
	}
}
