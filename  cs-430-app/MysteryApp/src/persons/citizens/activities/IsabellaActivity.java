package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Isabella;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class IsabellaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.isabella);
		setNonPlayerFields(Isabella.getIsabella(), R.drawable.ambassador_head);
	}
}