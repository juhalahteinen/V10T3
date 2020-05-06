package com.example.v10t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView web;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.webView);
        et = findViewById(R.id.editText);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
    }

    public void lataa(View v) {
        String loppu = et.getText().toString();
        String alku = "file:///android_asset/";
        String url = alku + loppu;
        web.loadUrl(alku + loppu);
    }

    public void temppu(View v) {
        web.evaluateJavascript("javascript:shoutOut()", null);
    }

    public void refresh(View v) {
        web.evaluateJavascript("javascript:initialize()", null);
    }
}