package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Play extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);    
        Bundle extras = getIntent().getExtras();
        String background = extras.getString("background");
        if(background.compareToIgnoreCase("background1") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.background1full);	
        }
        else if(background.compareToIgnoreCase("background2") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.background2full);
        }
        else if(background.compareToIgnoreCase("background3") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.background3full);
        }
        else if(background.compareToIgnoreCase("china2") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.china2full);
        }
        else if(background.compareToIgnoreCase("city1") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.city1full);
        }
        else if(background.compareToIgnoreCase("city2") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.city2full);
        }
        else if(background.compareToIgnoreCase("city4") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.city4full);
        }
        else if(background.compareToIgnoreCase("egypt") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.egyptfull);
        }
        else if(background.compareToIgnoreCase("russia1") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.russia1full);
        }
        else if(background.compareToIgnoreCase("russia2") == 0){
        	LinearLayout linLay = (LinearLayout) findViewById(R.id.linearLayout1);
        	linLay.setBackgroundResource(R.drawable.russia2full);
        }
    }
    
    public void map(View view){
        // View the Map
        Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);  
    }
    
	public void menu(View view){
	    // View In-game Menu
        Intent i = new Intent(getApplicationContext(), Menu.class);
        startActivity(i);
	}
	
	public void meetChar(View view){
		Intent i = new Intent(getApplicationContext(), Ambassador.class);
        startActivity(i);
	}
	
	public void startMinesweeper(View view){
		Intent i = new Intent(getApplicationContext(), MinesweeperActivity.class);
        startActivity(i);
	}	
	
}