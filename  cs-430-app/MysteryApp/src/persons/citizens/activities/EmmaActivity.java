package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Emma;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class EmmaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.emma);
		setNonPlayerFields(Emma.getEmma(), R.drawable.deadend_sm);
	}
}