package locations.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.activities.Emperor;
import persons.leaders.EmperorEddy;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrientPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orient);
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(EmperorEddy.getEmperorEddy().getDescription(), 3000, R.drawable.emperor3_head);
    	Intent i = new Intent(getApplicationContext(), Emperor.class);
        startActivity(i);
    }
    
}