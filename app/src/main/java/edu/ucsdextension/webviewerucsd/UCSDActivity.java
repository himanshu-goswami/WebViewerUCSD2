package edu.ucsdextension.webviewerucsd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UCSDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd);

        WebView ucsdWebview = (WebView) findViewById(R.id.UCSDWebViewer);
        ucsdWebview.loadUrl("https://extension.ucsd.edu/");
    }
}
