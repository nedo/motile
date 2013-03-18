package com.motile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;

public class CheckBoxActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_box);
		CheckBox vCheckBox = (CheckBox) findViewById(R.id.CheckBoxActivity_CheckBox2);
		vCheckBox.setChecked(true);
	}
}
