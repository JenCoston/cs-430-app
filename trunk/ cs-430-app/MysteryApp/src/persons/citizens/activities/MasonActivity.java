package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Mason;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class MasonActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mason);
		setNonPlayerFields(Mason.getMason(), R.drawable.ambassador_head);
	}
}