package locations.activities;


import game.Story;

import com.android.mysteryApp.R;
import locations.Ambrosia;

import persons.activities.Ambassador;
import persons.leaders.AmbassadorAmber;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.mysteryApp.R;

public class AmbrosiaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambrosia);
        setLocationFields(Ambrosia.getAmbrosia(), R.layout.ambrosia);
    }
    
    
    public void explorePlace(View view){
    	if(!Story.getStory().isVictim(AmbassadorAmber.getAmbassadorAmber())){
	    	showDialog(AmbassadorAmber.getAmbassadorAmber().getDescription(), 3000, R.drawable.ambassador_head);
	    	Intent i = new Intent(getApplicationContext(), Ambassador.class);
	        startActivity(i);
    	}
    	else{
    		showDialog("Everyone in Ambrosia is too busy mourning to talk!", 3000, R.drawable.background3);
    	}
    }
    
}