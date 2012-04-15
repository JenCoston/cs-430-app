package locations.activities;

import com.android.mysteryApp.R;
import persons.activities.Ambassador;
import persons.leaders.AmbassadorAmber;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AmbrosiaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambrosia);
    }
    
    
    public void explorePlace(View view){
    	showDialog(AmbassadorAmber.getAmbassadorAmber().getDescription(), 3000, R.drawable.ambassador_head);
    	Intent i = new Intent(getApplicationContext(), Ambassador.class);
        startActivity(i);
    }
    
}