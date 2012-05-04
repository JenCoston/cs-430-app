package com.android.mysteryApp;

import game.Game;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MysteryAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Game.getGame();
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
    
    public void showDisclaimers(View view){    
    	// View Disclaimers
        Intent i = new Intent(getApplicationContext(), Disclaimer.class);
        startActivity(i);
    }
    
    public void quit(View view){   
    	Intent intent = new Intent(Intent.ACTION_MAIN);
    	intent.addCategory(Intent.CATEGORY_HOME);
    	intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    	startActivity(intent);
    }
    
}