package locations.activities;

import game.Story;
import locations.Orient;

import com.android.mysteryApp.R;
import persons.activities.Emperor;
import persons.leaders.EmperorEddy;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrientPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orient);
        setLocationFields(Orient.getOrient(), R.layout.orient);
    }
    
    
    public void explorePlace(View view){
    	if(Story.getStory().isVictim(EmperorEddy.getEmperorEddy())){
	    	showDialog(EmperorEddy.getEmperorEddy().getDescription(), 3000, R.drawable.emperor3_head);
	    	Intent i = new Intent(getApplicationContext(), Emperor.class);
	        startActivity(i);
    	}
    	else{
    		showDialog("Now what possibly do you think you could learn from Orient?", 3000, R.drawable.orient);
    	}
    }
    
}