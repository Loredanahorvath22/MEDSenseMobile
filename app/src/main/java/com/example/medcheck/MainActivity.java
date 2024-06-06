package com.example.medcheck;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    WebView MEDSense;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MEDSense = findViewById(R.id.MEDSense);
        MEDSense.getSettings().setJavaScriptEnabled(true);
        MEDSense.getSettings().setDomStorageEnabled(true);
        MEDSense.getSettings().setDatabaseEnabled(true);

        MEDSense.setWebViewClient(new WebViewClient());
        MEDSense.loadUrl("https://jolly-pond-0abd46703.5.azurestaticapps.net/");
    }
}