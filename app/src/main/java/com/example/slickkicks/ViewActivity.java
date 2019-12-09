package com.example.slickkicks;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewActivity {
    private String string;
    ViewActivity(String setString) {
        string = setString;
    }
    public void goIn() {
        WebView webView = findViewById(R.id.temp);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(string);
    }
}
