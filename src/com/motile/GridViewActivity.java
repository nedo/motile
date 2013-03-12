package com.motile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewActivity extends Activity {
	GridView gridView; 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = (GridView)findViewById(R.id.GridViewActivity_GridView1);
 
        MyAdapter adapter = new MyAdapter(this);
        gridView.setAdapter(adapter);
    }
	
	public class MyAdapter extends BaseAdapter {
		  final int NumberOfItem = 30;
		  private Bitmap[] bitmap = new Bitmap[NumberOfItem];
		  private Context context;
		  private LayoutInflater layoutInflater;
		  MyAdapter(Context c){
		   context = c;
		   layoutInflater = LayoutInflater.from(context);
		    
		   //init dummy bitmap,
		   //using R.drawable.icon for all items
		   for(int i = 0; i < NumberOfItem; i++){
		    bitmap[i] = BitmapFactory.decodeResource(context.getResources(), R.drawable.tab_icon);
		   }
		  }
		 
		  @Override
		  public int getCount() {
		   // TODO Auto-generated method stub
		   return bitmap.length;
		  }
		 
		  @Override
		  public Object getItem(int position) {
		   // TODO Auto-generated method stub
		   return bitmap[position];
		  }
		 
		  @Override
		  public long getItemId(int position) {
		   // TODO Auto-generated method stub
		   return position;
		  }
		 
		  @Override
		  public View getView(int position, View convertView, ViewGroup parent) {
		   // TODO Auto-generated method stub
		    
		   View grid;
		   if(convertView==null){
		    grid = new View(context);
		    grid = layoutInflater.inflate(R.layout.grid_view_layout, null); 
		   }else{
		    grid = (View)convertView; 
		   }
		    
		   ImageView imageView = (ImageView)grid.findViewById(R.id.GridViewImage1);
		   imageView.setImageBitmap(bitmap[position]);
		   TextView textView = (TextView)grid.findViewById(R.id.GridViewText1);
		   textView.setText(String.valueOf(position));
		   return grid;
		  }
		 
		 }
		 
		 
		     

}
