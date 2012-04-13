package locations.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.activities.PrimeMinister;
import persons.leaders.PrimeMinisterPatrick;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PeoriaPlace extends LocationActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peoria);
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(PrimeMinisterPatrick.getPrimeMinisterPatrick().getDescription(), 3000, R.drawable.pm2_head);
    	Intent i = new Intent(getApplicationContext(), PrimeMinister.class);
        startActivity(i);
    }
    
}