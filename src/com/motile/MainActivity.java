package com.motile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
	Button button1, button2, button3, button4, button5, button6, vSmallButton, vSpinner, vSwitch, vRatingBar, vTabs, vListView, vGridView, vCalenderView, vDateTimePicker;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button) findViewById(R.id.MainActivity_WebViewButton);
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				loadWebView();
			}
		});
		
		button2 = (Button) findViewById(R.id.MainActivity_CustomHTMLButton);
		button2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				loadCustomHTMLWebView();
				
			}
		});
	
		button3 = (Button) findViewById(R.id.MainActivity_ImageViewButton);
		button3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				loadImageView();
				
			}
		});
		
		button4 = (Button)findViewById(R.id.MainActivity_RadioButton);
		button4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				loadRadionButton();
				
			}
		});
		
		button5 = (Button) findViewById(R.id.MainActivity_CheckBox);
		button5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				loadCheckBox();
			}
		});
		
		button6 = (Button) findViewById(R.id.MainActivity_ToggleButton);
		button6.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				loadToggleButton();				
			}
		});
		
		vSmallButton = (Button) findViewById(R.id.MainActivity_SmallButton);
		vSmallButton.setOnClickListener(new View.OnClickListener() {						
			public void onClick(View v) {
				loadSmallButton();				
			}
		});
		vSpinner = (Button) findViewById(R.id.MainActivity_Spinner);
		vSpinner.setOnClickListener(new View.OnClickListener() {						
			public void onClick(View v) {
				loadSpinner();				
			}
		});		
		
		vSwitch = (Button) findViewById(R.id.MainActivity_SWitch);
		vSwitch.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View view) {
				loadSwitch();				
			}
		});
		
		vRatingBar = (Button) findViewById(R.id.MainActivity_RatingBar);
		vRatingBar.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View view) {
				loadRatingBar();				
			}
		});
		
		vTabs = (Button)findViewById(R.id.MainActivity_Tabs);
		vTabs.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				loadTabs();				
			}
		});
		
		vListView = (Button)findViewById(R.id.MainActivity_ListView);
		vListView.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				loadListView();				
			}
		});
		
		vGridView = (Button)findViewById(R.id.MainActivity_GridView);
		vGridView.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				loadGridView();
			}
		});
		
		vCalenderView = (Button) findViewById(R.id.MainActivity_CalenderView);
		vCalenderView.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				loadCalenderView();				
			}
		});
		
		vDateTimePicker = (Button) findViewById(R.id.MainActivity_DateTimePicker);
		vDateTimePicker.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				loadDateTimePicker();				
			}
		});
	}

	void loadWebView()
	{
		Intent intent = new Intent(this, WebViewActivity.class);
	    startActivity(intent);	
	}
	
	void loadCustomHTMLWebView()
	{
		Intent intent = new Intent(this, CustomHTMLWebView.class);
	    startActivity(intent);	
	}

	void loadImageView()
	{
		Intent intent = new Intent(this, ImageViewActivity.class);
	    startActivity(intent);
	}
	
	void loadRadionButton()
	{
		Intent intent = new Intent(this, RadioButtonActivity.class);
	    startActivity(intent);
	}
	
	void loadCheckBox()
	{
		Intent intent = new Intent(this, CheckBoxActivity.class);
	    startActivity(intent);
	}
	
	void loadToggleButton()
	{
		Intent intent = new Intent(this, ToggleButtonActivity.class);
		startActivity(intent);
	}
	
	void loadSmallButton()
	{
		Intent vSmallButtonIntent = new Intent(this, SmallButtonActivity.class);
		startActivity(vSmallButtonIntent);
	}
	
	void loadSpinner()
	{
		Intent vSpinnerIntent = new Intent(this, SpinnerActivity.class);
		startActivity(vSpinnerIntent);
	}
	
	void loadSwitch()
	{
		//Intent vSwithcIntent = new Intent(this, SwitchActivity.class);
		//startActivity(vSwithcIntent);
		Toast.makeText(this, "Switch View \n Coming Soon", Toast.LENGTH_LONG).show();
	}
	
	void loadRatingBar()
	{
		Intent vRatingBarIntent = new Intent(this, RatingBarActivity.class);
		startActivity(vRatingBarIntent);
	}
	
	void loadTabs()
	{
		Intent vTabsIntent = new Intent(this, TabsActivity.class);
		startActivity(vTabsIntent);
	}
	
	void loadListView()
	{
		Intent vListViewIntent = new Intent(this, ListViewActivity.class);
		startActivity(vListViewIntent);
	}
	
	void loadGridView()
	{
		Intent vGridViewIntent = new Intent(this, GridViewActivity.class);
		startActivity(vGridViewIntent);
	}
	
	void loadCalenderView()
	{
		//Intent vCalenderViewIntent = new Intent(this, CalenderViewActivity.class);
		//startActivity(vCalenderViewIntent);
		Toast.makeText(this, "Calender View \n Coming Soon", Toast.LENGTH_LONG).show();
	}
	
	void loadDateTimePicker()
	{
		//Intent vDateTimePickerIntent = new Intent(this, DateTimePickerActivity.class);
		//startActivity(vDateTimePickerIntent);
		Toast.makeText(this, "DateTime View \n Coming Soon", Toast.LENGTH_LONG).show();
	}
}
