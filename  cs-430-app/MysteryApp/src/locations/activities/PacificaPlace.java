package locations.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.activities.President;
import persons.leaders.PresidentPaul;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PacificaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pacifica);
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(PresidentPaul.getPresidentPaul().getDescription(), 3000, R.drawable.president1_head);
    	Intent i = new Intent(getApplicationContext(), President.class);
        startActivity(i);
    }
    
}