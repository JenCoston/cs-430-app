package locations.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.activities.Dictator;
import persons.leaders.DictatorDave;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DislexiaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dislexia);
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(DictatorDave.getDictatorDave().getDialog(), 3000, R.drawable.president2_head);
    	Intent i = new Intent(getApplicationContext(), Dictator.class);
        startActivity(i);
    }
    
}