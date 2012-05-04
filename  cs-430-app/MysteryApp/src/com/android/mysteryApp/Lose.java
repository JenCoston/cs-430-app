package com.android.mysteryApp;

import persons.Player;
import game.Logbook;
import game.Story;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class Lose extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lose);
        String notes = "Sorry " + Player.getPlayer().getName() +  "Lose!" + 
        		"\n Unfortunately you couldn't solve the mystery. " + 
        		"\n Here's what you should have found out: " + Story.getStory().getMurder() +
        		"\n Better luck next time!!";
        TextView t = new TextView(this); 
        t = (TextView)findViewById(R.id.textView1); 
        t.setText(notes);
        t.setMovementMethod(new ScrollingMovementMethod());
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
}