package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Calgary;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class CalgaryActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Calgary.getCalgary(), R.drawable.ambassador_head);
	}
}