package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Saaras;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class SaarasActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Saaras.getSaaras(), R.drawable.ambassador_head);
	}
}