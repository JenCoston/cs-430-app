package locations.activities;

import game.Story;
import locations.Dislexia;

import com.android.mysteryApp.R;
import persons.activities.Dictator;
import persons.leaders.DictatorDave;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DislexiaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dislexia);
        setLocationFields(Dislexia.getDislexia(), R.layout.dislexia);
    }
    
    
    public void explorePlace(View view){
    	if(!Story.getStory().isVictim(DictatorDave.getDictatorDave())){
	    	showDialog(DictatorDave.getDictatorDave().getDescription(), 3000, R.drawable.president2_head);
	    	Intent i = new Intent(getApplicationContext(), Dictator.class);
	        startActivity(i);
    	}
    	else{
    		showDialog("It's a little late to talk to the Dictator now don't you think?", 3000, R.drawable.city4);
    	}
    }
    
}