package com.example.norahalbazzai.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class frstActivity extends AppCompatActivity {

    private TextView txtRslt;
    private Button btnAdd, btnSub, btnMul, btnDiv, btnClear;
    private EditText editText1, editText2;
    private float op1, op2, op3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frst);


        // To link views from XML file to objects in java
        txtRslt = (TextView) findViewById(R.id.txtResult);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Read the two numbers, then convert it to float
                op1 = Float.parseFloat(editText1.getText().toString());
                op2 = Float.parseFloat(editText2.getText().toString());

                op3 = op1 + op2;

                // convert to String, Then Display result
                txtRslt.setText(Float.toString(op3));


            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Read the two numbers, then convert it to float
                op1 = Float.parseFloat(editText1.getText().toString());
                op2 = Float.parseFloat(editText2.getText().toString());

                op3 = op1 - op2;

                // convert to String, Then Display result
                txtRslt.setText(Float.toString(op3));


            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Read the two numbers, then convert it to float
                op1 = Float.parseFloat(editText1.getText().toString());
                op2 = Float.parseFloat(editText2.getText().toString());

                op3 = op1 * op2;

                // convert to String, Then Display result
                txtRslt.setText(Float.toString(op3));


            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Read the two numbers, then convert it to float
                op1 = Float.parseFloat(editText1.getText().toString());
                op2 = Float.parseFloat(editText2.getText().toString());

                op3 = op1 / op2;

                // convert to String, Then Display result
                txtRslt.setText(Float.toString(op3));


            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
                txtRslt.setText("");


            }
        });


    }
}
