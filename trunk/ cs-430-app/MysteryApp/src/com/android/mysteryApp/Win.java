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

public class Win extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win);
        String notes = "Congratulations " + Player.getPlayer().getName() + "!!!" +
        		"\n You solved the mystery and found your way out of a dead end!" + 
        		"\n Here's what you found out: " + Story.getStory().getMurder() +
        		"\n Make sure you play again there are many more mysteries to solve!";
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