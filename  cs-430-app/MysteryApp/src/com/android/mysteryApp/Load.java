package com.android.mysteryApp;

import game.DataLoader;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Load extends Activity {
	private final String saveFile1 = "save1";
	private final String saveFile2 = "save2";
	private final String saveFile3 = "save3";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load);
        /*SharedPreferences settings1 = getSharedPreferences(saveFile1, MODE_PRIVATE);
        Editor editor = settings1.edit();
        editor.putBoolean("testMode", true);
        editor.commit();*/
        setButtonTexts();
    }
    
    public void empty(View view){
    	// Empty
    	Intent i = new Intent(getApplicationContext(), NewGame.class);
        startActivity(i);
    }
    
    public void save1(View view) {
    	SharedPreferences settings1 = getSharedPreferences(saveFile1, MODE_PRIVATE);
        boolean test = settings1.getBoolean("testMode", false);//create an "empty" mode for save files
        if (test) {
        	//file has been made and saved
        	Button x = (Button) findViewById(R.id.save1button);
        	x.setText(saveFile1+" has data");
        }
        else {
        	//file was empty or did not exist, or file existed but no save data in slot - show as empty slot
        }
    }
    
    public void setButtonTexts() {
    	DataLoader dl = DataLoader.getDataLoader();
        boolean val = dl.save1HasSaveFile(getApplicationContext());
        if (val) {
        	Button x = (Button) findViewById(R.id.save1button);
        	x.setText(saveFile1+" has data - testing");
        }
        
        val = dl.save2HasSaveFile(getApplicationContext());
        if (val) {
        	Button x2 = (Button) findViewById(R.id.save2button);
        	x2.setText(saveFile2+" has data - testing");
        }
        
        val = dl.save3HasSaveFile(getApplicationContext());
        if (val) {
        	Button x3 = (Button) findViewById(R.id.save3button);
        	x3.setText(saveFile3+" has data - testing");
        }
    }
}