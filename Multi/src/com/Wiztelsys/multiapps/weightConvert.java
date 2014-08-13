package com.Wiztelsys.multiapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class weightConvert extends Activity implements
		AdapterView.OnItemSelectedListener {
	Spinner weightConvertInTypeSpinner, weightConvertOutTypeSpinner;
	String selectedweightUnitIn, selectedweightUnitOut;
	static EditText weightValueET;
	TextView weightoutputTV;
	static float weightValue, weightResult;

	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.weight_convert_page);
		String weightTypes[] = { "milligram", "gram", "Kilo gram", "ton",
				"pound", "ounce", "grain" };
		weightoutputTV=(TextView)findViewById(R.id.weightoutputTV);
		weightConvertInTypeSpinner = (Spinner) findViewById(R.id.weightConvertInTypeSpinner);

		ArrayAdapter<String> a1 = new ArrayAdapter<String>(this,
				R.layout.spinner_theme, weightTypes);
		weightResult = 0;
		weightValue = 1;
		weightConvertInTypeSpinner.setAdapter(a1);
		weightConvertInTypeSpinner.setOnItemSelectedListener(this);
		weightConvertOutTypeSpinner = (Spinner) findViewById(R.id.weightConvertOutTypeSpinner);
		weightConvertOutTypeSpinner.setAdapter(a1);
		weightConvertOutTypeSpinner.setOnItemSelectedListener(this);
		weightValueET = (EditText) findViewById(R.id.weightValueET);
		weightValueET.setText("0");

	}

	public void onItemSelected(AdapterView<?> arg0, View view, int arg2,
			long arg3) {
		TextView spinnerText = (TextView) view;
		switch (arg0.getId()) {
		case (R.id.weightConvertInTypeSpinner): {
			selectedweightUnitIn = spinnerText.getText().toString();
			
			
		}
		case (R.id.weightConvertOutTypeSpinner): {
			weightValue = Float.parseFloat(weightValueET.getText().toString()
					.trim());
			selectedweightUnitOut = spinnerText.getText().toString();

			if (selectedweightUnitIn == "milligram") 
			{
				if (selectedweightUnitOut == "milligram")
				{
					
					weightoutputTV.setText(weightValue+"");
				}
				else if (selectedweightUnitOut == "gram")
				{
					weightResult=(float) (weightValue*0.001);
				
				}
				else if (selectedweightUnitOut == "Kilo gram")
				{
					weightResult=(float) (weightValue*0.000001);
				
				}
				else if (selectedweightUnitOut == "pound")
				{
					weightResult=(float) (weightValue*.0000022046);
				
				}
				else if (selectedweightUnitOut == "ton")
				{
					weightResult=(float) (weightValue*.0000000011023);
					
				}
				else if (selectedweightUnitOut == "ounce")
				{
					weightResult=(float) (weightValue*.000035274);
					
				}
				else 
				{
					weightResult=(float) (weightValue*0.0154323584);
					
				}

			}
			
			
			
			
			else if (selectedweightUnitIn == "gram") 
			{
				if (selectedweightUnitOut == "milligram")
				{
					weightResult=(float) (weightValue*1000);
					

				}
				else if (selectedweightUnitOut == "gram")
				{
					weightResult=(float) (weightValue*1);
					
				}
				else if (selectedweightUnitOut == "Kilo gram")
				{
					weightResult=(float) (weightValue*0.001);
				
				}
				else if (selectedweightUnitOut == "pound")
				{
					weightResult=(float) (weightValue*0.00220462);
					
				}
				else if (selectedweightUnitOut == "ton")
				{
					weightResult=(float) (weightValue*0.0000011023);
					
				}
				else if (selectedweightUnitOut == "ounce")
				{
					weightResult=(float) (weightValue*0.035274);
					
				}
				else 
				{
					weightResult=(float) (weightValue*15.4323584);
					
			
				}

			} 
			else if (selectedweightUnitIn == "Kilo gram") 
			{
				if (selectedweightUnitOut == "milligram")
				{
					weightResult=(float) (weightValue*1000000);
					
			
				}
				else if (selectedweightUnitOut == "gram")
				{
					weightResult=(float) (weightValue*1000);
					
			
				}
				else if (selectedweightUnitOut == "Kilo gram")
				{weightResult=(float) (weightValue*1);
				
				

				}
				else if (selectedweightUnitOut == "pound")
				{
					weightResult=(float) (weightValue*2.20462);
					
				}
				else if (selectedweightUnitOut == "ton")
				{
					weightResult=(float) (weightValue*0.00110231);
				
				}
				else if (selectedweightUnitOut == "ounce")
				{
					weightResult=(float) (weightValue*35.274);
				
				}
				else 
				{
					weightResult=(float) (weightValue*15432.3584);
					
				}
			} 
			else if (selectedweightUnitIn == "pound")
			{
				if (selectedweightUnitOut == "milligram")
				{
					weightResult=(float) (weightValue*453592);
					
				}
				else if (selectedweightUnitOut == "gram")
				{
					weightResult=(float) (weightValue*453.592);
					
				}
				else if (selectedweightUnitOut == "Kilo gram")
				{weightResult=(float) (weightValue*0.453592);

				}
				else if (selectedweightUnitOut == "pound")
				{
					weightResult=(float) (weightValue*1);
				}
				else if (selectedweightUnitOut == "ton")
				{weightResult=(float) (weightValue*0.0005);

				}
				else if (selectedweightUnitOut == "ounce")
				{
					weightResult=(float) (weightValue*16);
				}
				else 
				{
					weightResult=(float) (weightValue*7000);
				}
			} 
			else if (selectedweightUnitIn == "ton")
			{
				if (selectedweightUnitOut == "milligram")
				{
					weightResult=(float) (weightValue*907200000);
				}
				else if (selectedweightUnitOut == "gram")
				{
					weightResult=(float) (weightValue*907185);
				}
				else if (selectedweightUnitOut == "Kilo gram")
				{
					weightResult=(float) (weightValue*907.185);
				}
				else if (selectedweightUnitOut == "pound")
				{
					weightResult=(float) (weightValue*2000);
				}
				else if (selectedweightUnitOut == "ton")
				{
					weightResult=(float) (weightValue*1);
				}
				else if (selectedweightUnitOut == "ounce")
				{
					weightResult=(float) (weightValue*32000);
				}
				else 
				{
					weightResult=(float) (weightValue*14000000);
				}
			}

			else if (selectedweightUnitIn == "ounce")
			{
				if (selectedweightUnitOut == "milligram")
				{
					weightResult=(float) (weightValue*28349.5);
				}
				else if (selectedweightUnitOut == "gram")
				{
					weightResult=(float) (weightValue*28.3495);
				}
				else if (selectedweightUnitOut == "Kilo gram")
				{
					weightResult=(float) (weightValue*0.0283495);
				}
				else if (selectedweightUnitOut == "pound")
				{
					weightResult=(float) (weightValue*0.0625);
				}
				else if (selectedweightUnitOut == "ton")
				{
					weightResult=(float) (weightValue*0.00003125);
				}
				else if (selectedweightUnitOut == "ounce")
				{
					weightResult=(float) (weightValue*1);
				}
				else 
				{
					weightResult=(float) (weightValue*437.5);
				}
			} 
			else {
				if (selectedweightUnitOut == "milligram")
				{
					weightResult=(float) (weightValue*64.79891);
				}
				else if (selectedweightUnitOut == "gram")
				{
					weightResult=(float) (weightValue*0.06479891 );
				}
				else if (selectedweightUnitOut == "Kilo gram")
				{
					weightResult=(float) (weightValue*0.00006479891);
				}
				else if (selectedweightUnitOut == "pound")
				{
					weightResult=(float) (weightValue*0.000142857143);
				}
				else if (selectedweightUnitOut == "ton")
				{
					weightResult=(float) (weightValue*0.0000000714285714);
				}
				else if (selectedweightUnitOut == "ounce")
				{
					weightResult=(float) (weightValue*0.00228571429);
				}
				else 
				{
					weightResult=(float) (weightValue*1);
				}
			}
			weightoutputTV.setText(weightResult+"");
	
			}
		}
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}
