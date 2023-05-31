package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class instagram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        WebView webView = (WebView) findViewById(R.id.instagramView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.instagram.com/yuriko_aishinselo/");
    }
}