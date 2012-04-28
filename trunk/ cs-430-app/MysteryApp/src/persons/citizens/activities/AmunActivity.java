package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Amun;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class AmunActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Amun.getAmun(), R.drawable.ambassador_head);
	}
}