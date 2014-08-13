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

public class lengthConvert extends Activity implements AdapterView.OnItemSelectedListener
{	EditText lengthValueET;
	TextView lengthOutputTV;
	float lengthvalue,lengthResult;
	Spinner LengthInSpinner,LengthOutSpinner;
	String lengthTypes[]={"Milli Meter", "Centi Meter","Meter","Kilo Meter","Mile","Yard","Foot","Inch"};
	String LengthSelectedUnitIn,LengthSelectedUnitOut;

@Override
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.length_convert_page);
		LengthInSpinner=(Spinner)findViewById(R.id.lengthUnitInSpinner);
		LengthOutSpinner=(Spinner)findViewById(R.id.lengthUnitOutSpinner);
		ArrayAdapter<String> a1 = new ArrayAdapter<String>(this,R.layout.spinner_theme,lengthTypes);
		LengthInSpinner.setAdapter(a1);
		LengthInSpinner.setOnItemSelectedListener(this);
		LengthOutSpinner= (Spinner) findViewById(R.id.lengthUnitOutSpinner);
		LengthOutSpinner.setAdapter(a1);
		LengthOutSpinner.setOnItemSelectedListener(this);
		lengthOutputTV=(TextView)findViewById(R.id.lengthOutputTV);
		lengthValueET=(EditText)findViewById(R.id.lengthValueInET);
		lengthValueET.setText("0");
	}
		

@Override
public void onItemSelected(AdapterView<?> arg0, View view, int arg2, long arg3) {
	TextView spinnerText = (TextView) view;
	switch (arg0.getId()) {
	case (R.id.lengthUnitInSpinner): {
		LengthSelectedUnitIn = spinnerText.getText().toString();
	/*	
	 * if(!(Float.parseFloat(lengthValueET.getText().toString())==0))
		{
			lengthvalue=Float.parseFloat(lengthValueET.getText().toString());
			
		}
	*/	
		
	
	}break;
	case (R.id.lengthUnitOutSpinner): {
		
		LengthSelectedUnitOut = spinnerText.getText().toString();
		lengthvalue=Float.parseFloat(lengthValueET.getText().toString());
		//"Milli Meter", "Centi Meter","Meter","Kilo Meter","Mile","Yard","Foot","Inch"
		if( LengthSelectedUnitIn=="Milli Meter")
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(float)lengthvalue*1  ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(float) (lengthvalue*0.1)  ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=lengthvalue/1000  ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=lengthvalue/1000000  ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult= (float) ( lengthvalue*0.00000062137);
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float) (lengthvalue* 0.00109361) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float) (lengthvalue* 0.00328084) ;
			}
			else 
			{
				lengthResult=(float) (lengthvalue*0.0393701)  ;
			}
		}
		else if( LengthSelectedUnitIn=="Centi Meter")
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(float)(lengthvalue* 10) ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(float)(lengthvalue* 1) ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=(float)(lengthvalue* .01) ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=(float)(lengthvalue* 0.00001) ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult=(float)(lengthvalue*0.0000062137 ) ;
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float)(lengthvalue*0.0109361 ) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float)(lengthvalue* 0.0328084) ;
			}
			else 
			{
				lengthResult=(float)(lengthvalue*0.393701 ) ;
			}
		}
		else if( LengthSelectedUnitIn=="Meter")
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(lengthvalue*1000 ) ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(lengthvalue*100 ) ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=(float)(lengthvalue*1 ) ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=(float)(lengthvalue*0.001 ) ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult=(float)(lengthvalue*0.000621371 ) ;
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float)(lengthvalue* 1.09361) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float)(lengthvalue*3.28084 ) ;
			}
			else 
			{
				lengthResult=(float)(lengthvalue*39.3701 ) ;
			}
		
		}
		else if( LengthSelectedUnitIn=="Kilo Meter")
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(float)(lengthvalue* 1000000) ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(float)(lengthvalue*100000 ) ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=(float)(lengthvalue* 1000) ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=(float)(lengthvalue* 1) ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult=(float)(lengthvalue*0.621371) ;
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float)(lengthvalue*1093.61 ) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float)(lengthvalue*3280.84 ) ;
			}
			else 
			{
				lengthResult=(float)(lengthvalue* 39370.1) ;
			}
		
		}
		else if( LengthSelectedUnitIn=="Mile")
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(float)(lengthvalue* 1609000) ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(float)(lengthvalue*160934 ) ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=(float)(lengthvalue*1609.34) ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=(float)(lengthvalue*1.60934 ) ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult=(float)(lengthvalue*1 ) ;
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float)(lengthvalue*1760 ) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float)(lengthvalue*5280 ) ;
			}
			else 
			{
				lengthResult=(float)(lengthvalue*63360 ) ;
			}
		
		}
		else if( LengthSelectedUnitIn=="Yard")
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(float)(lengthvalue*914.4 ) ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(float)(lengthvalue*91.44 ) ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=(float)(lengthvalue* 91.44) ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=(float)(lengthvalue*0.09144 ) ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult=(float)(lengthvalue*0.000568182 ) ;
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float)(lengthvalue*1 ) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float)(lengthvalue* 3) ;
			}
			else 
			{
				lengthResult=(float)(lengthvalue*36 ) ;
			}
		
		}
		else if( LengthSelectedUnitIn=="Foot")
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(float)(lengthvalue* 304.8) ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(float)(lengthvalue* 30.48) ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=(float)(lengthvalue*0.3048 ) ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=(float)(lengthvalue* 0.0003048) ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult=(float)(lengthvalue*0.000189394 ) ;
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float)(lengthvalue*0.333333 ) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float)(lengthvalue*3 ) ;
			}
			else 
			{
				lengthResult=(float)(lengthvalue*36) ;
			}
		
		}
		else
		{
			if(LengthSelectedUnitOut=="Milli Meter")
			{
				lengthResult=(float)(lengthvalue*25.4 ) ;
			}
			else if(LengthSelectedUnitOut=="Centi Meter")
			{
				lengthResult=(float)(lengthvalue*2.54 ) ;
			}
			else if(LengthSelectedUnitOut=="Meter")
			{
				lengthResult=(float)(lengthvalue*0.0254 ) ;
			}
			else if(LengthSelectedUnitOut=="Kilo Meter")
			{
				lengthResult=(float)(lengthvalue*0.0000254 ) ;
			}
			else if(LengthSelectedUnitOut=="Mile")
			{
				lengthResult=(float)(lengthvalue*0.000015783 ) ;
			}
			else if(LengthSelectedUnitOut=="Yard")
			{
				lengthResult=(float)(lengthvalue*0.0277778 ) ;
			}
			else if(LengthSelectedUnitOut=="Foot")
			{
				lengthResult=(float)(lengthvalue*0.0833333 ) ;
			}
			else 
			{
				lengthResult=(float)(lengthvalue*1 ) ;
			}
		
		}
		
		
		
//Toast.makeText(this, LengthSelectedUnitOut+"",Toast.LENGTH_SHORT).show();
		
	}break;
	}
	lengthOutputTV.setText(lengthResult+"");
	
}
@Override
public void onNothingSelected(AdapterView<?> arg0) {
	
	
}


}
