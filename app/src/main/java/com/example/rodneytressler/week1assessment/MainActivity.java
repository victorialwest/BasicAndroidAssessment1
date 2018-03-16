package com.example.rodneytressler.week1assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView
    private EditText
    private Button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView sampletextview = (TextView)  findViewById(R.id.sample_textview;
        EditText sampleedittext = (EditText) findViewById(R.id.sample_edittext);
        Button sampleButton = (Button) findViewById(R.id.sample_button);




    }

  protected void onClickListener(){
   sampleButton.setOnClickListener;

    }



}