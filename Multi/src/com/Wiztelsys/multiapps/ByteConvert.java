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

public class ByteConvert extends Activity implements	AdapterView.OnItemSelectedListener
{
	EditText ByteInValueET;
	Spinner byteInTypeSpinner,byteOutTypeSpinner;
	TextView ByteOutResultTV;
	String byteSelectedUnitIn,byteSelectedUnitOut;
	float byteInValue, ByteResultOutValue;
	String ByteUnits[]={"Byte","Kilobyte","Megabyte","Gigabyte","Bit"}; 
		@Override
protected void onCreate(Bundle savedInstanceState) 
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.byte_convert_page);
	ByteInValueET=(EditText)findViewById(R.id.byteValueInET);
	ByteInValueET.setText("0");
	ByteOutResultTV=(TextView)findViewById(R.id.byteOutputResultTV);
	byteInTypeSpinner=(Spinner)findViewById(R.id.ByteinTypeSpinner);
	byteOutTypeSpinner=(Spinner)findViewById(R.id.ByteOutTypeSpinner);
	ArrayAdapter<String> a1 = new ArrayAdapter<String>(this,R.layout.spinner_theme, ByteUnits);
	byteInTypeSpinner.setAdapter(a1);
	byteInTypeSpinner.setOnItemSelectedListener(this);
	byteOutTypeSpinner.setAdapter(a1);
	byteOutTypeSpinner.setOnItemSelectedListener(this);
}
		@Override
		public void onItemSelected(AdapterView<?> arg0, View view, int arg2,long arg3)
		{
			
			TextView spinnerText = (TextView) view;
			switch (arg0.getId())
			{
				case (R.id.ByteinTypeSpinner): 
				{
					byteSelectedUnitIn = spinnerText.getText().toString();
				//	Toast.makeText(this,byteSelectedUnitIn + "", Toast.LENGTH_SHORT).show();
				}
				case (R.id.ByteOutTypeSpinner): 
				{
					byteSelectedUnitOut = spinnerText.getText().toString();
				String valueString=	ByteInValueET.getText().toString().trim();
					byteInValue=Long.parseLong(valueString);
					
				
					if(byteSelectedUnitIn=="Byte")
					{
						if(byteSelectedUnitOut=="Byte")
						{
							ByteResultOutValue=byteInValue*1  ;
						}
						else if(byteSelectedUnitOut=="Kilobyte")
						{
							ByteResultOutValue=byteInValue/1024 ;
						}
						else if(byteSelectedUnitOut=="Megabyte")
						{
							ByteResultOutValue=byteInValue/1048576 ;
						}
						else if(byteSelectedUnitOut=="Gigabyte")
						{
							ByteResultOutValue=byteInValue/ 1073741824;
						}
						
						else if(byteSelectedUnitOut=="Bit")
						{
							ByteResultOutValue=byteInValue* 8 ;
						}
					}
					else if(byteSelectedUnitIn=="Kilobyte")
					{
						if(byteSelectedUnitOut=="Byte")
						{
							ByteResultOutValue=byteInValue*1024;
						}
						else if(byteSelectedUnitOut=="Kilobyte")
						{
							ByteResultOutValue=byteInValue* 1 ;
						}
						else if(byteSelectedUnitOut=="Megabyte")
						{
							ByteResultOutValue=byteInValue/1024 ;
						}
						else if(byteSelectedUnitOut=="Gigabyte")
						{
							ByteResultOutValue=byteInValue/ 1048576 ;
						}


						else if(byteSelectedUnitOut=="Bit")
						{
							ByteResultOutValue=byteInValue*8192 ;
						}
					}
					
					
					else if(byteSelectedUnitIn=="megabyte")
					{
						if(byteSelectedUnitOut=="Byte")
						{
							ByteResultOutValue=byteInValue*1048576 ;
						}
						else if(byteSelectedUnitOut=="Kilobyte")
						{
							ByteResultOutValue=byteInValue* 1024 ;
						}
						else if(byteSelectedUnitOut=="Megabyte")
						{
							ByteResultOutValue=byteInValue* 1 ;
						}
						else if(byteSelectedUnitOut=="Gigabyte")
						{
							ByteResultOutValue=byteInValue/1024 ;
						}
						
						else if(byteSelectedUnitOut=="Bit")
						{
							ByteResultOutValue=byteInValue*8388608 ;
						}
					}
					else if(byteSelectedUnitIn=="gigabyte")
					{
						if(byteSelectedUnitOut=="Byte")
						{
							ByteResultOutValue=byteInValue*1073741824 ;
						}
						else if(byteSelectedUnitOut=="Kilobyte")
						{
							ByteResultOutValue=byteInValue* 1048576 ;
						}
						else if(byteSelectedUnitOut=="Megabyte")
						{
							ByteResultOutValue=byteInValue*1024 ;
						}
						else if(byteSelectedUnitOut=="Gigabyte")
						{
							ByteResultOutValue=byteInValue*1  ;
						}
						
						else if(byteSelectedUnitOut=="Bit")
						{
							long  x= 8589934592L;
							ByteResultOutValue=byteInValue*(x);
						}
					}
					
					else if(byteSelectedUnitIn=="bit")
					{
						if(byteSelectedUnitOut=="Byte")
						{
							ByteResultOutValue=byteInValue/8;
						}
						else if(byteSelectedUnitOut=="Kilobyte")
						{
							ByteResultOutValue=byteInValue/8192  ;
						}
						else if(byteSelectedUnitOut=="Megabyte")
						{
							ByteResultOutValue=byteInValue/8388608 ;
						}
						else if(byteSelectedUnitOut=="Gigabyte")
						{
							ByteResultOutValue=byteInValue/ 8589934592L ;
						}
						
						else if(byteSelectedUnitOut=="Bit")
						{
							ByteResultOutValue=byteInValue*1  ;
						}
					}
				
				}
			};
			Toast.makeText(this,ByteResultOutValue + "", Toast.LENGTH_SHORT).show();
		ByteOutResultTV.setText(ByteResultOutValue+"");
		}
		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			
			
		}


}
