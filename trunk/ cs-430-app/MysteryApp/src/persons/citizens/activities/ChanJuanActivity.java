package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.ChanJuan;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class ChanJuanActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chanjuan);
		setNonPlayerFields(ChanJuan.getChanJuan(), R.drawable.deadend_sm);
	}
}