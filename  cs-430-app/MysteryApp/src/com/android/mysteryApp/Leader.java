package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Leader extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leader);
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
}