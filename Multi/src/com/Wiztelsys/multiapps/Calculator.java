package com.Wiztelsys.multiapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends Activity {
	float operand1, operand2, answer;
	StringBuffer op1, op2;
	char prevOperator, presentOperator;
	TextView calculatorResultTV;
	EditText calculatorET;
	Button eqBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator_page);
		operand1 = 0;
		prevOperator = '0';
		answer = 0;
		presentOperator = '0';
		calculatorResultTV = (TextView) findViewById(R.id.calculatorResultTV);
		op1 = new StringBuffer();
		op2 = new StringBuffer();
		calculatorET = (EditText) findViewById(R.id.ClaculatorET);
		eqBtn = (Button) findViewById(R.id.buttonEqual);

	}

	public void calculate(View view) {
		if (eqBtn.getText().toString() == "OK") {
			eqBtn.setText("=");
			calculatorResultTV.setText("");
			calculatorET.setText("");
			
		}
		Button inBtn = (Button) findViewById(view.getId());

		String input = inBtn.getText().toString();
		calculatorET.append(input);
		if (Character.isDigit(input.charAt(0))) {
			if (operand1 == 0) {
				op1.append(input);
			} else {
				op2.append(input);
			}
		} else {
			if (prevOperator == '0') {

				prevOperator = input.charAt(0);
				if (prevOperator == 'O') {
					prevOperator = 0;
				} else {
					operand1 = Float.parseFloat(op1.toString());
				}
			} else {
				presentOperator = input.charAt(0);

				operand2 = Float.parseFloat(op2.toString());
				switch (prevOperator) {
				case ('+'): {
					answer = operand1 + operand2;

				}
					break;
				case ('-'): {
					answer = operand1 - operand2;

				}
					break;

				case ('x'): {
					answer = operand1 * operand2;

				}
					break;

				case ('/'): {
					answer = operand1 / operand2;

				}
					break;

				}
				op2.delete(0, op2.length());
				prevOperator = presentOperator;
				operand1 = answer;
				if (presentOperator == '=') {

					calculatorResultTV.setText(answer + "");
					operand1 = 0;
					operand2 = 0;
					op1.delete(0, op1.length());
					op2.delete(0, op2.length());
		prevOperator='0';
		presentOperator='0';
		answer=0;
					eqBtn.setText("OK");
				}
			}
		}

	}
}
