package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Help extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        
        String help = "Welcome to the Mystery Game \n" +
        "After starting a new game, you will learn who was murdered.\n" + 
        "You will be presented with a map of places to investigate.\n" +
        "Travel through these places talking to important people and try to collect as many items and clues as possible.\n" +
        "Be the first to solve the mystery!";
    
        
        TextView t = new TextView(this); 
        t = (TextView)findViewById(R.id.textView1); 
        t.setText(help);
        t.setTextSize(18);
        
    }
    
    public void returnMM(View view){
        // Return to Main menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
}