package com.example.slickkicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewActivity extends AppCompatActivity {
    private String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        goIn(DisplayActivity.getTheUrl());
    }
    public void goIn(String str) {
        WebView webView = findViewById(R.id.temp);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(str);
    }


}
