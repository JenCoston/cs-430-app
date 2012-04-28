package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Ryan;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class RyanActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Ryan.getRyan(), R.drawable.ambassador_head);
	}
}