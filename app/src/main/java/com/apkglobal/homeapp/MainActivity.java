package com.apkglobal.homeapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apkglobal.homeapp.Animation.AnimActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_home;
    Button btn_about;
    Button btn_career;
    Button btn_contact, btn_website, btn_webview, btn_call, btn_share,btn_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home = (Button) findViewById(R.id.btn_home);
        btn_about = (Button) findViewById(R.id.btn_about);
        btn_career = (Button) findViewById(R.id.btn_career);
        btn_contact = (Button) findViewById(R.id.btn_contact);
        btn_call = (Button) findViewById(R.id.btn_call);
        btn_share = (Button) findViewById(R.id.btn_share);
        btn_anim = (Button)findViewById(R.id.btn_anim);

        //Without Webview-----------------------------------------
        btn_website = (Button) findViewById(R.id.btn_website);

        //------------------------With WebView---------------------
        btn_webview = (Button) findViewById(R.id.btn_webview);

        // ---------------------------------for single click each time----------------------

        /*btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });

        btn_career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,CareerActivity.class);
                startActivity(i);
            }
        });

        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(i);
            }
        });*/

        // ---------------------------------end of single click each time----------------------

        //--------------------------For multiple click -----------------------------------------

        btn_home.setOnClickListener(this);
        btn_about.setOnClickListener(this);
        btn_career.setOnClickListener(this);
        btn_contact.setOnClickListener(this);
        btn_website.setOnClickListener(this);
        btn_webview.setOnClickListener(this);
        btn_call.setOnClickListener(this);
        btn_share.setOnClickListener(this);
        btn_anim.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.btn_home:
                Intent i1 = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i1);
                break;

            case R.id.btn_about:
                Intent i2 = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i2);
                break;

            case R.id.btn_career:
                Intent i3 = new Intent(MainActivity.this, CareerActivity.class);
                startActivity(i3);
                break;

            case R.id.btn_contact:
                Intent i4 = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(i4);
                break;

            //Without WebView-----------------------------------
            case R.id.btn_website:
                Intent i5 = new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse("http://www.codezclub.com/"));

                startActivity(i5);
                break;

            //with WebView--------------------------------------

            case R.id.btn_webview:
                Intent i6 = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(i6);
                break;

            case R.id.btn_call:
                Intent i7 = new Intent(Intent.ACTION_CALL);
                i7.setData(Uri.parse("tel:+918628829553"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(i7);
                break;

            case R.id.btn_share:
                Intent i8 = new Intent(Intent.ACTION_SEND);
                i8.putExtra(Intent.EXTRA_TEXT,
                        "Click Here to Download App -> "+
                                "http://play.google.com/store/apps/details?id=com.example.whatsapp");

                i8.setType("text/plain");
                startActivity(Intent.createChooser(i8,"Share App Via :"));
                break;

            case R.id.btn_anim:
                Intent i9 = new Intent(getApplicationContext(), AnimActivity.class);
                startActivity(i9);
                break;
        }
    }
}
