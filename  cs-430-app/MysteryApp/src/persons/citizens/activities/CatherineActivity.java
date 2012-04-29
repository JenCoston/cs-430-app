package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Catherine;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class CatherineActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.catherine);
		setNonPlayerFields(Catherine.getCatherine(), R.drawable.ambassador_head);
	}
}