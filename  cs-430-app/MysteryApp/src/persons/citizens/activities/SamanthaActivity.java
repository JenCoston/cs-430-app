package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Samantha;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class SamanthaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.samantha);
		setNonPlayerFields(Samantha.getSamantha(), R.drawable.ambassador_head);
	}
}