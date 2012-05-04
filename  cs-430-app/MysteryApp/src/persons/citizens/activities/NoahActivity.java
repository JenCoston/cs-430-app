package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Noah;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class NoahActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.noah);
		setNonPlayerFields(Noah.getNoah(), R.drawable.deadend_sm);
	}
}