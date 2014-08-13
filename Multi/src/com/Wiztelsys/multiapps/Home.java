package com.Wiztelsys.multiapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.homepage);
	
}
public void calculator(View view)
{
	Intent I= new Intent(Home.this,Calculator.class);
	startActivity(I);
}
public void currencyExchange(View view)
{
	Intent I= new Intent(Home.this,CurrencyExchange.class);
	startActivity(I);
}

public void weightconvert(View view)
{
	Intent I= new Intent(Home.this,weightConvert.class);
	startActivity(I);
}

public void lengthconvert(View view)
{
	Intent I= new Intent(Home.this,lengthConvert.class);
	startActivity(I);
}

public void thermalconvert(View view)
{
	Intent I= new Intent(Home.this,ThermalConvert.class);
	startActivity(I);
}

public void byteconvert(View view)
{
	Intent I= new Intent(Home.this,ByteConvert.class);
	startActivity(I);
}
}

