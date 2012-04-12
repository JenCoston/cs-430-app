package persons.activities;

import com.android.mysteryApp.R;
import persons.leaders.PharaohFineas;
import android.os.Bundle;

public class Pharaoh extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pharaoh);
        setNonPlayerFields(PharaohFineas.getPharaohFineas(), R.drawable.pharaoh_head);
    }
    
}