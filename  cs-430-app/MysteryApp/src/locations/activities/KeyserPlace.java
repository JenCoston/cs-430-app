package locations.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.activities.King;
import persons.leaders.KingCarl;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KeyserPlace extends LocationActivity {
   
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keyser);
//        
//        TextView t = new TextView(this); 
//
//        t = (TextView)findViewById(R.id.textView1); 
//        t.setText(Ambrosia.getAmbrosia().getName());
    }
    
    
    public void explorePlace(View view){
    	showDialog(KingCarl.getKingCarl().getDialog(), 3000, R.drawable.king_head);
    	Intent i = new Intent(getApplicationContext(), King.class);
        startActivity(i);
    }
    
}