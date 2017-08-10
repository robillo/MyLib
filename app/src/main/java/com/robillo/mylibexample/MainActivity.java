package com.robillo.mylibexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.robillo.mylibrary.MyFunctions;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFunctions functions = new MyFunctions();
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(functions.returnStars(10));
    }
}
