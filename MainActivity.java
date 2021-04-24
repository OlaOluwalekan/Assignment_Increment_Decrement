package com.icode.IncreasingAndDecreasing;

//import android.app.*;
//import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.icode.IncreasingAndDecreasing.R;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	Button increment_button;
	Button decrement_button;
	TextView textview;
	private int increase = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		textview =(TextView)findViewById(R.id.textview);
		increment_button=(Button)findViewById(R.id.increment_button);
		decrement_button=(Button)findViewById(R.id.decrement_button);
		
		increment_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				increase++;
				textview.setText(Integer.toString(increase));					}
		});
		
		decrement_button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					increase--;
					textview.setText(Integer.toString(increase));					}
			});
    }
}
