package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Benjamin;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class BenjaminActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.benjamin);
		setNonPlayerFields(Benjamin.getBenjamin(), R.drawable.ambassador_head);
	}
}