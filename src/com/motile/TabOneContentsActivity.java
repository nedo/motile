package com.motile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TabOneContentsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_one_contents);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab_one_contents, menu);
		return true;
	}

}
