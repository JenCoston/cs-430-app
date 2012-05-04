package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Calgary;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class CalgaryActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calgary);
		setNonPlayerFields(Calgary.getCalgary(), R.drawable.deadend_sm);
	}
}