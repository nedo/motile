package com.motile;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends Activity implements OnItemSelectedListener{
	TextView vSelectedValue;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
	
		vSelectedValue = (TextView)findViewById(R.id.SpinnerActivity_TextView2);
		Spinner vSpinner = (Spinner) findViewById(R.id.SpinnerActivity_Spinner1);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Spinnper_array, android.R.layout.simple_spinner_dropdown_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		vSpinner.setAdapter(adapter);
		vSpinner.setOnItemSelectedListener(this);
		
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		Toast.makeText(this, "Selected Value: "+arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
		vSelectedValue.setText(arg0.getItemAtPosition(arg2).toString());		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		vSelectedValue.setText("Nothing is selected.");
	}

}
