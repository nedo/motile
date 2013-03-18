package com.motile;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class DateTimePickerActivity extends Activity {
	DatePicker datepicker;
	TimePicker timePicker1;
    int year , month , day, hour, minute;
    TextView vSelectedDateTime;
    String value;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_date_time_picker);
		
		datepicker = (DatePicker) findViewById(R.id.DateTimePickerActivity_DatePicker1);   
		vSelectedDateTime = (TextView) findViewById(R.id.DateTimePickerActivity_TextView2);
        timePicker1 = (TimePicker) findViewById(R.id.DateTimePickerActivity_TimePicker1);
 
		Button button = (Button) findViewById(R.id.DateTimePickerActivity_Button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {  
            	value = "";
            	final Calendar c = Calendar.getInstance();
        		hour = c.get(Calendar.HOUR_OF_DAY);
        		minute = c.get(Calendar.MINUTE);
        		value = value+"Time: "+new StringBuilder().append(pad(hour)).append(":").append(pad(minute));
        		
        		timePicker1.setCurrentHour(hour);
        		timePicker1.setCurrentMinute(minute);        		
                value = value +"Date : "+(datepicker.getMonth() + 1) +"/"+datepicker.getDayOfMonth() +"/"+datepicker.getYear();
                Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
                vSelectedDateTime.setText(value);  
            }
        });
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.date_time_picker, menu);
		return true;
	}

    	
	private static String pad(int c) {
		if (c >= 10)
		   return String.valueOf(c);
		else
		   return "0" + String.valueOf(c);
	}   
        
	
}
