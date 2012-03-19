package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Map extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
    
    public void startBackground1(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
        String value = "background1";
		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startBackground2(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
    	String value = "background2";
		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startBackground3(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
    	String value = "background3";
		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startChina2(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
    	String value = "china2";
		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startCity1(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
    	String value = "city1";
		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startEgypt(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
    	String value = "egypt";
		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startRussia1(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
    	String value = "russia1";
		i.putExtra("background", value);
    	startActivity(i);
    }
    
    public void startRussia2(View view){
    	Intent i = new Intent(getApplicationContext(), Play.class);
    	String value = "russia2";
		i.putExtra("background", value);
    	startActivity(i);
    }
}