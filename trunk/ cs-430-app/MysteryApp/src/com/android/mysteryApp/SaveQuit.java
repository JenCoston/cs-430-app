package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaveQuit extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savequit);
    }
    
    public void saveCont(View view){
        // Save and Continue
    }
    
    public void saveQuit(View view){
        // Save and Quit
    }
    
    public void quitNoSave(View view){
        // Quit Without Saving
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
}