package com.aps.simak13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class jadwalUjian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_ujian);
        WebView webView = (WebView) findViewById(R.id.jadwalUjian);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // Load the Google Drive document URL
        String googleDriveUrl = "https://drive.google.com/file/d/1EtLn0mL-m7zvOZKjkzlbx3BeDcGGCWHF/view?usp=sharing";
        webView.loadUrl(googleDriveUrl);

    }
}