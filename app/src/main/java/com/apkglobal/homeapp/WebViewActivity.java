package com.apkglobal.homeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        final WebView webView = (WebView)findViewById(R.id.btn_webview);
        webView.loadUrl("http://www.codezclub.com/");

        Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG);

    }
}
