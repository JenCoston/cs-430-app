package locations.activities;

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
    	showDialog(ChancellorChuck.getChancellorChuck().getDescription(), 2000, R.drawable.pm3_head);
    	Intent i = new Intent(getApplicationContext(), Chancellor.class);
        startActivity(i);
    }
    
}