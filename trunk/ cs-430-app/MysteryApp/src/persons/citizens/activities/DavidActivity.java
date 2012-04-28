package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.David;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class DavidActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(David.getDavid(), R.drawable.ambassador_head);
	}
}