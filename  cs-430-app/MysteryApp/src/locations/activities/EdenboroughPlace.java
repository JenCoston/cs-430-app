package locations.activities;

import locations.Edenborough;

import com.android.mysteryApp.R;
import persons.activities.Queen;
import persons.leaders.QueenLizzy;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EdenboroughPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edenborough);
        setLocationFields(Edenborough.getEdenborough(), R.layout.edenborough);
    }
    
    
    public void explorePlace(View view){
    	showDialog(QueenLizzy.getQueenLizzy().getDescription(), 3000, R.drawable.queen2_head);
    	Intent i = new Intent(getApplicationContext(), Queen.class);
        startActivity(i);
    }
    
}