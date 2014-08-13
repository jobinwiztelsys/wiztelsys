package com.Wiztelsys.multiapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash_theme_page);
	    Thread timer = new Thread(){
	        public void run(){
	            try{
	                sleep(5000);
	                Intent openHomePage = new Intent(MainActivity.this,Home.class);
	                startActivity(openHomePage);
	                
	            } 
	            catch 
	            (InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	            finally{
	            	finish();
	            }
	        }
	    };
	    timer.start();

	}

	

}
