package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Mathew;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class MathewActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mathew);
		setNonPlayerFields(Mathew.getMathew(), R.drawable.deadend_sm);
	}
}