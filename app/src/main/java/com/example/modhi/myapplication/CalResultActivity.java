package com.example.modhi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CalResultActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_result);

        result = (TextView) findViewById(R.id.result);
        result.setText("The result is:"+getIntent().getExtras().getString("RESULT"));
    }


}
