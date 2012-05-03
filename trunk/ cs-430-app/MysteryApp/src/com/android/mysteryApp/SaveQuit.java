package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaveQuit extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savequit);
    }
    
    public void saveCont(View view){
    	SharedPreferences settings2 = getSharedPreferences("save2", MODE_PRIVATE);
        Editor editor = settings2.edit();
        editor.putBoolean("testMode2", true);
        editor.commit();
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