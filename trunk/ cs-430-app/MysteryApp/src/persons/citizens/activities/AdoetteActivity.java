package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Adoette;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class AdoetteActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adoette);
		setNonPlayerFields(Adoette.getAdoette(), R.drawable.deadend_sm);
	}
}