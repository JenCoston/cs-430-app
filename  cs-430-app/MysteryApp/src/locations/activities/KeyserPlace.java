package locations.activities;

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
    	showDialog(KingCarl.getKingCarl().getDescription(), 3000, R.drawable.king_head);
    	Intent i = new Intent(getApplicationContext(), King.class);
        startActivity(i);
    }
    
}