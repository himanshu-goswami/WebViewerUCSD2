package edu.ucsdextension.webviewerucsd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class YahooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);


        WebView yahooWebview = (WebView) findViewById(R.id.YahooWebViewer);
        yahooWebview.loadUrl("https://www.yahoo.com/");
    }
}
