package com.example.webviewornegi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.facebook.com");
        final ProgressDialog progressDialog=ProgressDialog.show(this,"facebook","Yükleniyor...",true);
        progressDialog.show();
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Toast.makeText(getApplicationContext(),"Sayfa Yüklendi",Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                Toast.makeText(getApplicationContext(),"Bir Hata Oluştu",Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        });
    }
}
