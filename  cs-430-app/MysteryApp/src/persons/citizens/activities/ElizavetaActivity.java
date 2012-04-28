package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Elizaveta;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class ElizavetaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Elizaveta.getElizaveta(), R.drawable.ambassador_head);
	}
}