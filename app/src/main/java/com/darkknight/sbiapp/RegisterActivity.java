package com.darkknight.sbiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button btnNew,btnInb,btnFreedom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnNew = (Button) findViewById(R.id.btnNew);
        btnInb = (Button) findViewById(R.id.btnInb);
        btnFreedom = (Button) findViewById(R.id.btnFreedom);

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this,NewActivity.class);
                startActivity(i);
            }
        });

        btnInb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(RegisterActivity.this,INBActivity.class);
                startActivity(i);
            }
        });

        btnFreedom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this,FreedomActivity.class);
                startActivity(i);
            }
        });
    }
}
