package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Bernette;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class BernetteActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bernette);
		setNonPlayerFields(Bernette.getBernette(), R.drawable.ambassador_head);
	}
}