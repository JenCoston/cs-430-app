package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.ChancellorChuck;
import android.os.Bundle;

public class Chancellor extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chancellor);
        setNonPlayerFields(ChancellorChuck.getChancellorChuck(), R.drawable.pm3_head);
	}
    
}