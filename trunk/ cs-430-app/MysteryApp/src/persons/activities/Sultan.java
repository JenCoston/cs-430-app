package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.SultanSam;
import android.os.Bundle;

public class Sultan extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sultan);
        setNonPlayerFields(SultanSam.getSultanSam(), R.drawable.sultan1_head);
	}
    
}