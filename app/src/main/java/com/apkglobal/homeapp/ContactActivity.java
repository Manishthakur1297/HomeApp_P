package com.apkglobal.homeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_submit,btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        btn_back = (Button)findViewById(R.id.btn_back);
        btn_submit = (Button)findViewById(R.id.btn_submit);

        btn_back.setOnClickListener(this);
        btn_submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id)
        {
            case R.id.btn_back:
                Intent back = new Intent(ContactActivity.this,MainActivity.class);
                startActivity(back);
                break;

            case R.id.btn_submit:
                break;
        }

    }
}
