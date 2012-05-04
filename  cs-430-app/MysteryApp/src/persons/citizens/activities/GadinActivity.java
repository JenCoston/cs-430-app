package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Gadin;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class GadinActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gadin);
		setNonPlayerFields(Gadin.getGadin(), R.drawable.deadend_sm);
	}
}