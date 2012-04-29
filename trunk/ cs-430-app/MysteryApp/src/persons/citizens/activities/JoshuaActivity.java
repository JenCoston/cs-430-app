package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Joshua;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class JoshuaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.joshua);
		setNonPlayerFields(Joshua.getJoshua(), R.drawable.ambassador_head);
	}
}