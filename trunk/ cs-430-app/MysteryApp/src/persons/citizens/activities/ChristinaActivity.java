package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Christina;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class ChristinaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Christina.getChristina(), R.drawable.ambassador_head);
	}
}