package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.DictatorDave;
import android.os.Bundle;

public class Dictator extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictator);
        setNonPlayerFields(DictatorDave.getDictatorDave(), R.drawable.president2_head);
	}
    
}