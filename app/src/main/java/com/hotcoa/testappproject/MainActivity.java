package com.hotcoa.testappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    public Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttontest=(Button) findViewById(R.id.button123);
        TextView textviewtest = (TextView) findViewById(R.id.textView123);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Analyze.maTest();
                //Analyze.extractTest();


                textviewtest.setText(Analyze.maTest());

            }
        };


        buttontest.setOnClickListener(listener);




    }


}