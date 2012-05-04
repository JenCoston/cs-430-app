package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Ewan;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class EwanActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ewan);
		setNonPlayerFields(Ewan.getEwan(), R.drawable.deadend_sm);
	}
}