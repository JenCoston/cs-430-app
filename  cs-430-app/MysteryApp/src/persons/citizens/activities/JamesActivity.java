package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.James;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class JamesActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(James.getJames(), R.drawable.ambassador_head);
	}
}