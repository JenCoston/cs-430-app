package locations.activities;

import locations.Scimitar;

import com.android.mysteryApp.R;
import persons.activities.Sultan;
import persons.leaders.SultanSam;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScimitarPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scimitar);
        setLocationFields(Scimitar.getScimitar(), R.layout.scimitar);
    }
    
    
    public void explorePlace(View view){
    	showDialog(SultanSam.getSultanSam().getDescription(), 3000, R.drawable.sultan1_head);
    	Intent i = new Intent(getApplicationContext(), Sultan.class);
        startActivity(i);
    }
    
}