package com.android.mysteryApp;

import game.DataLoader;
import persons.NonPlayer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SaveQuit extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savequit);
    }
    
    public void saveCont(View view){
    	/*SharedPreferences settings2 = getSharedPreferences("save2", MODE_PRIVATE);
        Editor editor = settings2.edit();
        editor.putBoolean("testMode2", true);
        editor.commit();*/
        
        final DataLoader dl = DataLoader.getDataLoader();
		final CharSequence[] saveStatuses = dl.getSaveStatuses(getApplicationContext());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Select slot to save game:");
    	builder.setItems(saveStatuses, new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int choice) {
    			/*NonPlayer curr = npcs[choice];
    			showDialog(curr.getName() + ": " + curr.getDescription(), 3000, R.drawable.president1_head);
    			Intent characterIntent = npcs[choice].getIntent(getApplicationContext());
    			startActivity(characterIntent);*/
    			Toast.makeText(getApplicationContext(), saveStatuses[choice], Toast.LENGTH_LONG).show();
    			dl.setSaveStatus(getApplicationContext(), choice, true);
    		}
    	});
    	AlertDialog alert = builder.create();
    	alert.show();
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