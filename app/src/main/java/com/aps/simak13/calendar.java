package com.aps.simak13;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CalendarView;
import android.widget.EditText;
import java.sql.Date;
import java.util.EventListener;

public class calendar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        WebView webView = (WebView) findViewById(R.id.calendarView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // Load the Google Drive document URL
        String googleDriveUrl = "https://drive.google.com/file/d/1OqrZNZmWwle-uEZn24zQ1HcQTracSGP1/view";
        webView.loadUrl(googleDriveUrl);
    }
}