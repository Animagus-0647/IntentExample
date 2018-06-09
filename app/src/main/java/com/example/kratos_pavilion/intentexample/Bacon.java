package com.example.kratos_pavilion.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);


    }
    public void onClick(View view) {
        Intent i=new Intent(this,apples.class);

        startActivity(i);
    }


}
