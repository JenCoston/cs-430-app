package locations.activities;

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
    	showDialog(PharaohFineas.getPharaohFineas().getDescription(), 3000, R.drawable.pharaoh_head);
    	Intent i = new Intent(getApplicationContext(), Pharaoh.class);
        startActivity(i);
    }
}