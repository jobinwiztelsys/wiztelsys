package com.Wiztelsys.multiapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ThermalConvert extends Activity implements	AdapterView.OnItemSelectedListener
{
	Spinner thermalInSpinner, thermalOutSpinner;
	EditText thermalValueInET;
	TextView thermalOutTV;
	float thermalvalueIn, thermalValueOut;
	String tempratureTypes[] = { "Kelvin", "Fahrenheit", "Celsius" };
	String thermalSelectedUnitIn, thermalSelectedUnitOut;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thermal_convert_page);
		thermalInSpinner = (Spinner) findViewById(R.id.thermalInUnitSpinner);
		thermalOutSpinner = (Spinner) findViewById(R.id.thermalOutUnitSpinner);
		thermalValueInET = (EditText) findViewById(R.id.thermalValueInET);
		thermalOutTV = (TextView) findViewById(R.id.thermalOutputTV);
		thermalValueInET.setText("0");
		ArrayAdapter<String> a1 = new ArrayAdapter<String>(this,
				R.layout.spinner_theme, tempratureTypes);
		thermalInSpinner.setAdapter(a1);
		thermalInSpinner.setOnItemSelectedListener(this);
		thermalOutSpinner.setAdapter(a1);
		thermalOutSpinner.setOnItemSelectedListener(this);

	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View view, int arg2,long arg3)
	{
		TextView spinnerText = (TextView) view;
		switch (arg0.getId())
		{
			case (R.id.thermalInUnitSpinner): 
			{
				thermalSelectedUnitIn = spinnerText.getText().toString();
				//Toast.makeText(this, thermalSelectedUnitIn + "", Toast.LENGTH_SHORT).show();
			}
			case (R.id.thermalOutUnitSpinner):
			{
			thermalSelectedUnitOut = spinnerText.getText().toString();
			thermalvalueIn = Float.parseFloat(thermalValueInET.getText().toString());
			if (thermalSelectedUnitIn == "Kelvin")
			{
				if (thermalSelectedUnitOut == "Kelvin")
				{
					thermalValueOut = thermalvalueIn;

					// (K - 273.15)* 1.8000 + 32.00
				} 
				else if (thermalSelectedUnitOut == "Fahrenheit")
				{
					thermalValueOut = (float) ((thermalvalueIn - 273.15) * 1.8 + 32);
				} else
				{
					// K - 273.15
					thermalValueOut = (float) (thermalvalueIn - 273.15);

				}

			}
			else if (thermalSelectedUnitIn == "Fahrenheit")
			{
				if (thermalSelectedUnitOut == "Kelvin") 
				{
					// / ((f-32)/1.8)+273.15
					thermalValueOut = (float) (((thermalvalueIn - 32) / 1.8) + 273.15);
				} 
				else if (thermalSelectedUnitOut == "Fahrenheit") 
				{
					thermalValueOut = thermalvalueIn;
				} 
				else
				{
					thermalValueOut	=(float) ((thermalvalueIn-32)/1.8);
					
				}
			}
			else
			{
				if (thermalSelectedUnitOut == "Kelvin")
				{
						thermalValueOut = (float) (thermalvalueIn + 273.15);
				} 
				else if (thermalSelectedUnitOut == "Fahrenheit") 
				{
						thermalValueOut = (float) ((thermalvalueIn * 1.8) + 32);
				} 
				else
				{
						thermalValueOut = thermalvalueIn;
				}
			}
		};
		thermalOutTV.setText(""+thermalValueOut);
			

	}
}
		
	

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {

	}

}
