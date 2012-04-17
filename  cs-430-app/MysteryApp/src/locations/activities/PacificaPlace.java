package locations.activities;

import game.Story;
import locations.Pacifica;

import com.android.mysteryApp.R;
import persons.activities.President;
import persons.leaders.PresidentPaul;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PacificaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pacifica);
        setLocationFields(Pacifica.getPacifica(), R.layout.pacifica);
    }
    
    
    public void explorePlace(View view){
    	if(!Story.getStory().isVictim(PresidentPaul.getPresidentPaul())){
	    	showDialog(PresidentPaul.getPresidentPaul().getDescription(), 3000, R.drawable.president1_head);
	    	Intent i = new Intent(getApplicationContext(), President.class);
	        startActivity(i);
    	}
    	else{
    		showDialog("Please come back at a better time!", 3000, R.drawable.city1);
    	}
    }
    
}