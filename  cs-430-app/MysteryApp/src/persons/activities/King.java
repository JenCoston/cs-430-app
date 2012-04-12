package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.KingCarl;
import android.os.Bundle;

public class King extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.king);
        setNonPlayerFields(KingCarl.getKingCarl(), R.drawable.king_head);
	}
    
}