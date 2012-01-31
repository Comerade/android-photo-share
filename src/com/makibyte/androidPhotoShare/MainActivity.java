package com.makibyte.androidPhotoShare;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {
  /** Called when the activity is first created. */
  @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      
      GridView gridview = (GridView) findViewById(R.id.gridview);
      gridview.setAdapter(new ImageAdapter(this));
      
      /* 
      gridview.setOnItemClickListener(new OnItemClickListener() {
    	  public void onItemCLick(AdapterView<?> parent, View v, int position, long id) {
    		  Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
    	  }
      });
      */
    }
}
