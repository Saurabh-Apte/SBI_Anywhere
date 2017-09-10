package com.darkknight.sbiapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FreedomActivity extends AppCompatActivity {
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freedom);

        btnSubmit= (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =new AlertDialog.Builder(FreedomActivity.this);
                builder.setMessage("Our systems are experiencing problem right now. Please try after some time")
                        .setNegativeButton("CANCEL",null)
                        .create()
                        .show();
            }
        });
    }
}
