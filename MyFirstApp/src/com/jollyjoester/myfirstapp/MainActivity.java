package com.jollyjoester.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setVisibility(View.INVISIBLE);
    }

	public void pushedButton(View view) {

		if (textView1.getVisibility() == View.INVISIBLE) {

			textView1.setVisibility(View.VISIBLE);

		} else {

			textView1.setVisibility(View.INVISIBLE);

		}

	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
