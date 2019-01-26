package com.mrigindia.mrigindia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        WebView web = findViewById(R.id.profile);

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/profile.html");
    }
}
