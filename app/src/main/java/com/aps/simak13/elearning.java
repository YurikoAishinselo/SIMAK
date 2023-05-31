package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class elearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearning);
        WebView webView = (WebView) findViewById(R.id.elearningBtn);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://elearning.uvers.ac.id");
    }
}