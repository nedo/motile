package com.motile;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class ListViewActivity extends Activity{
	ListView myList;
	Button getChoice;
	String[] listContent = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        myList = (ListView)findViewById(R.id.ListViewActivity_ListView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, listContent);
        myList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        myList.setAdapter(adapter);
        
        getChoice = (Button)findViewById(R.id.ListViewActivity_Button1);
        getChoice.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v) {
				String selected = "";
				int cntChoice = myList.getCount();
				SparseBooleanArray sparseBooleanArray = myList.getCheckedItemPositions();
				for(int i = 0; i < cntChoice; i++){
					if(sparseBooleanArray.get(i)) {
						selected += myList.getItemAtPosition(i).toString() + "\n";
					}
				}
				Toast.makeText(ListViewActivity.this, selected, Toast.LENGTH_LONG).show();
			}
    });
}
}