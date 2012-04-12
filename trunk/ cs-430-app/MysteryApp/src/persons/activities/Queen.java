package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.QueenLizzy;
import android.os.Bundle;

public class Queen extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.queen);
        setNonPlayerFields(QueenLizzy.getQueenLizzy(), R.drawable.queen2_head);
	}
    
}