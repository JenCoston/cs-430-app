package com.android.mysteryApp;

import persons.Player;
import game.Logbook;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Inventory extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory);
        String notes = "Here are the items you currently have in your bag: \n" + Player.getPlayer().listItems();
        TextView t = new TextView(this); 
        t = (TextView)findViewById(R.id.textView1); 
        t.setText(notes);
        t.setMovementMethod(new ScrollingMovementMethod());
    }
    
    public void returnGame(View view){
    	Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
}