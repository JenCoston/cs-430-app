package persons.citizens.activities;

import persons.activities.NonPlayerActivity;
import persons.citizens.Machakw;

import com.android.mysteryApp.R;
import android.os.Bundle;

public class MachakwActivity extends NonPlayerActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.machakw);
		setNonPlayerFields(Machakw.getMachakw(), R.drawable.ambassador_head);
	}
}