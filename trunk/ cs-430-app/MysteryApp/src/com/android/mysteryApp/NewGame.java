package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewGame extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newgame);        
    }
    
    public void existChar(View view){        
		 // Use existing character
    	// Load existing char info somehow
    	Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);
    }
    
    public void newChar(View view){
        // Create a New Character
        Intent i = new Intent(getApplicationContext(), CreateChar.class);
        startActivity(i);
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
}