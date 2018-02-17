package com.example.android.businesscard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text;
        text = "<html><body  style=\"text-align:justify;color:white;background-color:DarkCyan;\">";
        text+= getString(R.string.text);
        text+= "</p></body></html>";
        WebView webView=(WebView) findViewById(R.id.webView);
        webView.loadData(text,"text/html","UTF-8");
    }
}
