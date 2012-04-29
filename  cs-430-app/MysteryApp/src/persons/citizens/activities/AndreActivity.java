package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Andre;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class AndreActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.andre);
		setNonPlayerFields(Andre.getAndre(), R.drawable.ambassador_head);
	}
}