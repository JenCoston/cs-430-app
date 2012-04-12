package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.AmbassadorAmber;
import android.os.Bundle;

public class Ambassador extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambassador);
        setNonPlayerFields(AmbassadorAmber.getAmbassadorAmber(), R.drawable.ambassador_head);
    }
    
}