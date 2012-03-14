package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateChar extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createchar);
        
    }
    
    public void submit(View view){
        // Submit
    	// Need to add loc for storing character info and updating before going to map.
    	Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);
    }
    
    public void cancel(View view){
    	// Cancel
    	Intent i = new Intent(getApplicationContext(), NewGame.class);
        startActivity(i);
    }
   
}