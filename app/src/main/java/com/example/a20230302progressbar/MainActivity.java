package com.example.a20230302progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton1;
    private Button mButton2;
    private ProgressBar mProgerssBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mProgerssBarHorizontal = (ProgressBar) findViewById(R.id.horizontal_progressbar);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button1:
                mProgerssBarHorizontal.incrementProgressBy(10);
                mProgerssBarHorizontal.incrementSecondaryProgressBy(10);
                break;
            case R.id.button2:
                mProgerssBarHorizontal.incrementProgressBy(-10);
                mProgerssBarHorizontal.incrementSecondaryProgressBy(-10);

            default :
                break;
        }
    }
}