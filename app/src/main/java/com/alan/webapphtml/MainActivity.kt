package com.alan.webapphtml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.web_view)
        val settings = webView.settings
        settings.javaScriptEnabled = true
        settings.allowFileAccess = true
//        webView.loadUrl("http://www.baidu.com")

        findViewById<Button>(R.id.button).setOnClickListener {
            webView.loadUrl("file:android_asset/index3.html")
        }


    }
}