package com.wiztelsys.trials.mycomeback;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class lowbrightness extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.brightnesspage);
		WindowManager.LayoutParams lp = getWindow().getAttributes();
		lp.screenBrightness=0;
	    getWindow().setAttributes(lp);
	    Toast.makeText(getBaseContext(), "max brightness set" , Toast.LENGTH_SHORT ).show(); 
	}
	
		
	}
