package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Gabrielle;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class GabrielleActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gabrielle);
		setNonPlayerFields(Gabrielle.getGabrielle(), R.drawable.ambassador_head);
	}
}