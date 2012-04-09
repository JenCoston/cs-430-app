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
    	showDialog(Concordia.getConcordia().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), ConcordiaPlace.class);
//        String value = "background1";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startBackground2(View view){
    	showDialog(Keyser.getKeyser().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), KeyserPlace.class);
//    	String value = "background2";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startBackground3(View view){
    	showDialog(Ambrosia.getAmbrosia().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), AmbrosiaPlace.class);
    	//String value = "background3";
		//i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startChina2(View view){
    	showDialog(Scimitar.getScimitar().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), ScimitarPlace.class);
//    	String value = "china2";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startCity1(View view){
    	showDialog(Pacifica.getPacifica().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), PacificaPlace.class);
//    	String value = "city1";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startEgypt(View view){
    	showDialog(Wallaby.getWallaby().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), WallabyPlace.class);
//    	String value = "egypt";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startRussia1(View view){
    	showDialog(Orient.getOrient().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), OrientPlace.class);
//    	String value = "russia1";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startRussia2(View view){
    	showDialog(Edenborough.getEdenborough().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), EdenboroughPlace.class);
//    	String value = "russia2";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startCity4(View view){
    	showDialog(Dislexia.getDislexia().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), DislexiaPlace.class);
//    	String value = "russia2";
//		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startCity2(View view){
    	showDialog(Peoria.getPeoria().getDescription(), 2000);
    	Intent i = new Intent(getApplicationContext(), PeoriaPlace.class);
//    	String value = "russia2";
//		i.putExtra("background", value);
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