package com.android.mysteryApp;

import game.Game;
import game.Logbook;
import game.Story;
import persons.Player;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CreateChar extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createchar);
        
    }
    
    public void submit(View view){
    	final EditText plain_edit_text = (EditText) this.findViewById(R.id.editText1);
        String response = plain_edit_text.getText().toString();
        if(response == null){
        	showDialog("Make sure you submit a username", 5000); 
        }
        else{
        	Player.getPlayer().setUpPlayer(response);
        	Game.getGame();
        	String text = Story.getStory().getVictim().getFullName() + " was murdered yesterday! Can you help us find the culprit?";
        	Logbook.getLogbook().addNote("\t" + text);
        	showDialog(Player.getPlayer().getName() + ": " + text, 10000);
        }
    	Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);
    }
    
    public void cancel(View view){
    	// Cancel
    	Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
    
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