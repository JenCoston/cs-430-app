package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Akila;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class AkilaActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambassador);
		setNonPlayerFields(Akila.getAkila(), R.drawable.ambassador_head);
	}
}