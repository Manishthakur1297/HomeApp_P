package com.apkglobal.homeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CareerActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);

        btn_back = (Button)findViewById(R.id.btn_back);

        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id)
        {
            case R.id.btn_back:
                Intent back = new Intent(CareerActivity.this,MainActivity.class);
                startActivity(back);
                break;
        }

    }
}