package locations.activities;

import game.Story;
import locations.Peoria;

import com.android.mysteryApp.R;
import persons.activities.PrimeMinister;
import persons.leaders.PrimeMinisterPatrick;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PeoriaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peoria);
        setLocationFields(Peoria.getPeoria(), R.layout.peoria);
    }
    
    
    public void explorePlace(View view){
    	if(!Story.getStory().isVictim(PrimeMinisterPatrick.getPrimeMinisterPatrick())){
	    	showDialog(PrimeMinisterPatrick.getPrimeMinisterPatrick().getName() + ": " + PrimeMinisterPatrick.getPrimeMinisterPatrick().getDescription(), 3000, R.drawable.pm2_head);
	    	Intent i = new Intent(getApplicationContext(), PrimeMinister.class);
	        startActivity(i);
    	}
    	else{
    		showDialog(PrimeMinisterPatrick.getPrimeMinisterPatrick().getDescription(), 3000, R.drawable.city2);
    	}
    }
    
}