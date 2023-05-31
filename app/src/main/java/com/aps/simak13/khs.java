package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class khs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khs);
        WebView webView = (WebView) findViewById(R.id.khs);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://simak.uvers.ac.id/01/khs.php");
    }
}