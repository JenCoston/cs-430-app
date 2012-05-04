package com.android.mysteryApp;

import game.Story;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Solve extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solve);
    }
    
    public void returnMM(View view){
        // Return to Main Menu
        Intent i = new Intent(getApplicationContext(), MysteryAppActivity.class);
        startActivity(i);
    }
    
    public void submitMystery(View view){
    	final EditText plain_edit_text = (EditText) this.findViewById(R.id.editText1);
        String response = plain_edit_text.getText().toString();
        final EditText plain_edit_text1 = (EditText) this.findViewById(R.id.editText2);
        String response1 = plain_edit_text1.getText().toString();
        final EditText plain_edit_text2 = (EditText) this.findViewById(R.id.editText3);
        String response2 = plain_edit_text2.getText().toString();
        
        if(response == null || response1 == null || response2 == null || response.equalsIgnoreCase("") || response1.equalsIgnoreCase("") || response2.equalsIgnoreCase("")){
        	showDialog("Make sure you give an answer to all three areas!", 5000); 
        }
        else{
        	if(Story.getStory().solved(response, response1, response2)){
        		Intent i = new Intent(getApplicationContext(), Win.class);
                startActivity(i);
        	}
        	else{
        		Intent i = new Intent(getApplicationContext(), Lose.class);
                startActivity(i);
        	}
        }
    }
    
	public void showDialog(String message, int milliseconds)
	{
		// show message
		Toast dialog = Toast.makeText(
				getApplicationContext(),
				message,
				Toast.LENGTH_LONG);

		dialog.setGravity(Gravity.CENTER, 0, 0);
		LinearLayout dialogView = (LinearLayout) dialog.getView();
		dialog.setDuration(milliseconds);
		dialog.show();
	}
}