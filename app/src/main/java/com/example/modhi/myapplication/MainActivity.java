package com.example.modhi.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView outputName;
    EditText inputName;
    int result;

    Button plus, minus, multiplication;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputName = (EditText) findViewById(R.id.editText);
        outputName = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                /*
                if (!inputName.getText().equals(null)) {
                    outputName.setText(inputName.getText());
                }
                else
                {

                }*/

                Intent next = new Intent(MainActivity.this, CalResultActivity.class);
                startActivity(next);

            }
        });

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        plus = (Button) findViewById(R.id.plusButton);
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                result = Integer.parseInt(num1.getText().toString())
                +Integer.parseInt(num2.getText().toString());
                Intent next = new Intent(MainActivity.this, CalResultActivity.class);
                next.putExtra("RESULT", Integer.toString(result));
                startActivity(next);

            }
        });

        minus = (Button) findViewById(R.id.minusButton);
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        multiplication = (Button) findViewById(R.id.multiplicationButton);
        multiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

    }
}
