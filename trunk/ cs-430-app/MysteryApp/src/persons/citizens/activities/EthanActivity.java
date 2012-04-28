package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Ethan;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class EthanActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Ethan.getEthan(), R.drawable.ambassador_head);
	}
}