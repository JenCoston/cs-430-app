package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Alexander;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class AlexanderActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alexander);
		setNonPlayerFields(Alexander.getAlexander(), R.drawable.ambassador_head);
	}
}