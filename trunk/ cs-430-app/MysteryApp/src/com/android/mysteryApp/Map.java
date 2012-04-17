package com.android.mysteryApp;

import locations.Ambrosia;
import locations.Concordia;
import locations.Dislexia;
import locations.Edenborough;
import locations.Keyser;
import locations.Orient;
import locations.Pacifica;
import locations.Peoria;
import locations.Scimitar;
import locations.Wallaby;
import locations.activities.AmbrosiaPlace;
import locations.activities.ConcordiaPlace;
import locations.activities.DislexiaPlace;
import locations.activities.EdenboroughPlace;
import locations.activities.KeyserPlace;
import locations.activities.OrientPlace;
import locations.activities.PacificaPlace;
import locations.activities.PeoriaPlace;
import locations.activities.ScimitarPlace;
import locations.activities.WallabyPlace;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Map extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
    }
    
    public void returnMM(View view){
        // Return to Main Menu
    	showDialog("Leaving so soon?", 2000);
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
    
    public void startBackground1(View view){
    	showDialog(Concordia.getConcordia().getName() + ": " + Concordia.getConcordia().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), ConcordiaPlace.class);
    	startActivity(i);
    }
    
    public void startBackground2(View view){
    	showDialog(Keyser.getKeyser().getName() + ": " + Keyser.getKeyser().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), KeyserPlace.class);
    	startActivity(i);
    }
    
    public void startBackground3(View view){
    	showDialog(Ambrosia.getAmbrosia().getName() + ": " + Ambrosia.getAmbrosia().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), AmbrosiaPlace.class);
    	startActivity(i);
    }
    
    public void startChina2(View view){
    	showDialog(Scimitar.getScimitar().getName() + ": " + Scimitar.getScimitar().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), ScimitarPlace.class);
    	startActivity(i);
    }
    
    public void startCity1(View view){
    	showDialog(Pacifica.getPacifica().getName() + ": " + Pacifica.getPacifica().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), PacificaPlace.class);
    	startActivity(i);
    }
    
    public void startEgypt(View view){
    	showDialog(Wallaby.getWallaby().getName() + ": " +Wallaby.getWallaby().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), WallabyPlace.class);
    	startActivity(i);
    }
    
    public void startRussia1(View view){
    	showDialog(Orient.getOrient().getName() + ": " + Orient.getOrient().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), OrientPlace.class);
    	startActivity(i);
    }
    
    public void startRussia2(View view){
    	showDialog(Edenborough.getEdenborough().getName() + ": " + Edenborough.getEdenborough().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), EdenboroughPlace.class);
    	startActivity(i);
    }
    
    public void startCity4(View view){
    	showDialog(Dislexia.getDislexia().getName() + ": " + Dislexia.getDislexia().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), DislexiaPlace.class);
    	startActivity(i);
    }
    
    public void startCity2(View view){
    	showDialog(Peoria.getPeoria().getName() + ": " + Peoria.getPeoria().getDescription(), 3000);
    	Intent i = new Intent(getApplicationContext(), PeoriaPlace.class);
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
		dialog.setDuration(milliseconds);
		dialog.show();
	}
}