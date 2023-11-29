package com.example.wiresharkviewer;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView) findViewById(R.id.webView);
        WebSettings websettings = mywebview.getSettings();;
        websettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://login.univ-cotedazur.fr/login?service=https://ent.univ-cotedazur.fr/uPortal/Login");
        mywebview.setWebViewClient(new WebViewClient());
    }
    public void onBackPresses() {
        if(mywebview.canGoBack()) {
            mywebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
// testing github