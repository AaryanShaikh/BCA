package com.cypher.tasks;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class task extends AppCompatActivity {

    WebView webView;
    ProgressDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        webView = (WebView) findViewById(R.id.WV);

        progressBar = new ProgressDialog(task.this);
        progressBar.setMessage("loading");
        progressBar.show();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new webViewController());
        webView.loadUrl("https://www.google.com");
    }

    public class webViewController extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            progressBar.dismiss();
        }
    }
}

