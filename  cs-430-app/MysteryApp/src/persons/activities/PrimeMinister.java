package persons.activities;

import com.android.mysteryApp.R;
import com.android.mysteryApp.R.drawable;
import com.android.mysteryApp.R.layout;

import persons.leaders.PrimeMinisterPatrick;
import android.os.Bundle;

public class PrimeMinister extends NonPlayerActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeminister);
        setNonPlayerFields(PrimeMinisterPatrick.getPrimeMinisterPatrick(), R.drawable.pm2_head);
	}
    
}