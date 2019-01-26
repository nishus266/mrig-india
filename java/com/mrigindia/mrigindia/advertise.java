package com.mrigindia.mrigindia;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class advertise extends AppCompatActivity {
    private static int time_out= 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertise);
        WebView web = findViewById(R.id.main);

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/advertise.html");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(advertise.this, main.class);
                startActivity(i);
                finish();
            }
        }, time_out);
    }
}
