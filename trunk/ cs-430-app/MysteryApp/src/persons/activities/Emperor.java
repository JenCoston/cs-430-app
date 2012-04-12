package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.EmperorEddy;
import android.os.Bundle;

public class Emperor extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emperor);
        setNonPlayerFields(EmperorEddy.getEmperorEddy(), R.drawable.emperor3_head);
	}
    
}