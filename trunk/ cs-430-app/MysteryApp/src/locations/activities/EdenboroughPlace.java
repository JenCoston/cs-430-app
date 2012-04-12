package locations.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

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
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(QueenLizzy.getQueenLizzy().getDialog(), 3000, R.drawable.queen2_head);
    	Intent i = new Intent(getApplicationContext(), Queen.class);
        startActivity(i);
    }
    
}