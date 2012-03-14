package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Play extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);        
    }
    
    public void map(View view){
        // View the Map
        Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);  
    }
    
	public void menu(View view){
	    // View In-game Menu
        Intent i = new Intent(getApplicationContext(), Menu.class);
        startActivity(i);
	}
}