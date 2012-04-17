package locations.activities;

import game.Story;
import locations.Concordia;

import com.android.mysteryApp.R;
import persons.activities.Chancellor;
import persons.leaders.ChancellorChuck;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConcordiaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concordia);
        setLocationFields(Concordia.getConcordia(), R.layout.concordia);
    }
    
    
    public void explorePlace(View view){
    	if(!Story.getStory().isVictim(ChancellorChuck.getChancellorChuck())){
	    	showDialog(ChancellorChuck.getChancellorChuck().getDescription(), 2000, R.drawable.pm3_head);
	    	Intent i = new Intent(getApplicationContext(), Chancellor.class);
	        startActivity(i);
    	}
    	else{
    		showDialog("Isn't it kind of rude to come to Concordia at a time like this!", 3000, R.drawable.background1);
    	}
    }
    
}