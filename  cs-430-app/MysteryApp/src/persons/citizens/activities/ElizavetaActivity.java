package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Elizaveta;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class ElizavetaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.elizaveta);
		setNonPlayerFields(Elizaveta.getElizaveta(), R.drawable.deadend_sm);
	}
}