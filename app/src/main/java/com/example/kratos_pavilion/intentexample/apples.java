package com.example.kratos_pavilion.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.content.Intent;
import  android.view.View;
import android.widget.EditText;

public class apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
        Intent intent=new Intent(this,MyService.class);
        startService(intent);

    }
       public void onClick(View view){
        Intent i=new Intent(this,Bacon.class);

        startActivity(i);
    }
}
