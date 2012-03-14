package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Load extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load);
    }
    
    public void empty(View view){
    	// Empty
    	Intent i = new Intent(getApplicationContext(), NewGame.class);
        startActivity(i);
    }
}