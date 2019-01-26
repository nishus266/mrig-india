package com.mrigindia.mrigindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class main extends AppCompatActivity {
    @JavascriptInterface
    public void test(){
            Intent i = new Intent(main.this, profile.class);
            startActivity(i);
            finish();
        }
    float x1,y1;
    float x2,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView web = findViewById(R.id.main2);

        web.getSettings().setJavaScriptEnabled(true);
        web.addJavascriptInterface(this, "android");
        web.setOnTouchListener(new View.OnTouchListener() {
            // Removed @Override
            public boolean onTouch(View v, MotionEvent touchevent) {
                switch(touchevent.getAction())
                {
                    // when user first touches the screen we get x and y coordinate
                    case MotionEvent.ACTION_DOWN:
                    {
                        x1 = touchevent.getX();
                        y1 = touchevent.getY();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    {
                        x2 = touchevent.getX();
                        y2 = touchevent.getY();
                        //if left to right sweep event on screen
                        if (x1 < x2 &&(x2-x1)>300)
                        {
                            Intent i = new Intent(main.this,news.class);
                            startActivity(i);
                        }



                    }
                }
                return false;
            }
        });
        web.loadUrl("file:///android_asset/menu.html");
    }

}
