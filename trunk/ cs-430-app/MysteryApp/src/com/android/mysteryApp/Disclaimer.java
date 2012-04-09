package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Disclaimer extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disclaimer);
      String dis = "The Images found throughout this game were collected from ClipArt. \n " +
      		"The mini-games were collected from various open source sites. \n" +
      		"Fill this in more completely later";
      TextView t = new TextView(this); 

      t = (TextView)findViewById(R.id.textView1); 
      t.setText(dis);
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
}