package locations.activities;

import game.Story;
import locations.Wallaby;

import com.android.mysteryApp.R;
import persons.activities.Pharaoh;
import persons.leaders.PharaohFineas;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WallabyPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallaby);
        setLocationFields(Wallaby.getWallaby(), R.layout.wallaby);
    }
    
    
    public void explorePlace(View view){
    	if(!Story.getStory().isVictim(PharaohFineas.getPharaohFineas())){
	    	showDialog(PharaohFineas.getPharaohFineas().getName() + ": " + PharaohFineas.getPharaohFineas().getDescription(), 3000, R.drawable.pharaoh_head);
	    	Intent i = new Intent(getApplicationContext(), Pharaoh.class);
	        startActivity(i);
    	}
    	else{
    		showDialog("Come back after we have sorted out this mess!", 3000, R.drawable.egypt);
    	}
    }
}