package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.PresidentPaul;
import android.os.Bundle;

public class President extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.president);
        setNonPlayerFields(PresidentPaul.getPresidentPaul(), R.drawable.president1_head);
	}
    
}