package com.android.mysteryApp;

import persons.leaders.AmbassadorAmber;
import persons.leaders.SultanSam;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Sultan extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sultan);
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView2); 
//        t.setText(AmbassadorAmber.getAmbassadorAmber().getName());
    }
    
    
    public void charTalk(View view){
    	showDialog(SultanSam.getSultanSam().converse(), 3000);
    }
    
    public void giveItem(View view){   
        // Resume a Saved Game
    	Intent i = new Intent(getApplicationContext(), Load.class);
        startActivity(i);
    }
    
    public void returnMap(View view){  
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), Map.class);
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
		coolImage.setImageResource(R.drawable.sultan1_head);
		dialogView.addView(coolImage, 0);
		dialog.setDuration(milliseconds);
		dialog.show();
	}
    
}