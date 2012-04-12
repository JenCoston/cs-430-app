package locations.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

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
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(ChancellorChuck.getChancellorChuck().getDialog(), 2000, R.drawable.pm3_head);
    	Intent i = new Intent(getApplicationContext(), Chancellor.class);
        startActivity(i);
    }
    
}