package com.android.mysteryApp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MysteryAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    
    public void startGame(View view){
      // Start a New Game
      Intent i = new Intent(getApplicationContext(), NewGame.class);
      startActivity(i);

    }
    
    public void resumeGame(View view){   
        // Resume a Saved Game
    	Intent i = new Intent(getApplicationContext(), Load.class);
        startActivity(i);
    }
    
    public void leader(View view){  
        // View the Leader Board
        Intent i = new Intent(getApplicationContext(), Leader.class);
        startActivity(i);
    }
    
    public void help(View view){    
    	// View Gameplay Help
        Intent i = new Intent(getApplicationContext(), Help.class);
        startActivity(i);
    }
    
    public void quit(View view){   
        // Quit Game
    }
    
}