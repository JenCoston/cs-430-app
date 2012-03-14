package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
    
    public void logbook(View view){
        // View the Logbook
        Intent i = new Intent(getApplicationContext(), Logbook.class);
        startActivity(i);
    }
    
    public void inventory(View view){
        // Check Inventory
        Intent i = new Intent(getApplicationContext(), Inventory.class);
        startActivity(i);
    }
    
    public void savequit(View view){
        // Save and/or Quit
        Intent i = new Intent(getApplicationContext(), SaveQuit.class);
        startActivity(i);     
    }
	  public void returnGame(View view){  
	    // Return to current game
		  Intent i = new Intent(getApplicationContext(), Map.class);
	      startActivity(i);
	  }
}