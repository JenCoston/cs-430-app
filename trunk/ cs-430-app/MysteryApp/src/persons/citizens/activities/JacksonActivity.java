package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Jackson;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class JacksonActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jackson);
		setNonPlayerFields(Jackson.getJackson(), R.drawable.deadend_sm);
	}
}