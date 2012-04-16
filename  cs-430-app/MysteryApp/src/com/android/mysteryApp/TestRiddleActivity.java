package com.android.mysteryApp;

import android.app.Activity;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestRiddleActivity extends Activity {
	private String riddleText;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        TextView tv = new TextView(this);
        tv.setText(riddleText);
        layout.addView(tv);
        KeyboardView keyboard = new KeyboardView(this, null);//////////
        setContentView(layout);
    }
	
	public void setRiddleFields(String riddleText) {
		this.riddleText = riddleText;
	}
	
	
}
