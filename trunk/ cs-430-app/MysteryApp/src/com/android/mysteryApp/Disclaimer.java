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
      String dis = "All images found in this game are from clipart.com school edition." + 
        "These royalty-free images were made available through a subscription. \n " +
    		  "Riddles are from: \n" +
      		" Lupton, Hugh, and Sophie Fatus. Riddle Me This!:" + 
      		"Riddles and Stories to Challenge Your Mind. Cambridge, MA:" + 
      		"Barefoot, 2003. Print.";
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