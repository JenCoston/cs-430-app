package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Andrew;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class AndrewActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.andrew);
		setNonPlayerFields(Andrew.getAndrew(), R.drawable.deadend_sm);
	}
}