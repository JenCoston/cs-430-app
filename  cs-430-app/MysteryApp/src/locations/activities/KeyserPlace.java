package locations.activities;

import game.Story;
import locations.Keyser;

import com.android.mysteryApp.R;
import persons.activities.King;
import persons.leaders.KingCarl;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KeyserPlace extends LocationActivity {
   
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keyser);
        setLocationFields(Keyser.getKeyser(), R.layout.keyser);
    }
    
    
    public void explorePlace(View view){
    	if(Story.getStory().isVictim(KingCarl.getKingCarl())){
    	showDialog(KingCarl.getKingCarl().getDescription(), 3000, R.drawable.king_head);
    	Intent i = new Intent(getApplicationContext(), King.class);
        startActivity(i);
    	}
        else{
    		showDialog("God Save the King", 3000, R.drawable.keyser);
    	}
    }
    
}