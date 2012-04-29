package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Aadrika;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class AadrikaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aadrika);
		setNonPlayerFields(Aadrika.getAadrika(), R.drawable.ambassador_head);
	}
}