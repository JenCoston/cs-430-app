package com.android.mysteryApp;

import locations.Ambrosia;
import persons.leaders.AmbassadorAmber;
import persons.leaders.PrimeMinisterPatrick;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PeoriaPlace extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peoria);
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(PrimeMinisterPatrick.getPrimeMinisterPatrick().getDialog(), 3000);
    	Intent i = new Intent(getApplicationContext(), PrimeMinister.class);
        startActivity(i);
    }
    
    public void gatherItem(View view){   
        // Resume a Saved Game
    	Intent i = new Intent(getApplicationContext(), Load.class);
        startActivity(i);
    }
    
    public void returnMM(View view){  
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
    
	private void showDialog(String message, int milliseconds)
	{
		// show message
		Toast dialog = Toast.makeText(
				getApplicationContext(),
				message,
				Toast.LENGTH_LONG);

		dialog.setGravity(Gravity.CENTER, 0, 0);
		LinearLayout dialogView = (LinearLayout) dialog.getView();
		ImageView coolImage = new ImageView(getApplicationContext());
		coolImage.setImageResource(R.drawable.pm2_head);
		dialogView.addView(coolImage, 0);
		dialog.setDuration(milliseconds);
		dialog.show();
	}
    
}