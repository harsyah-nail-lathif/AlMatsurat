package com.example.dzikirpagipetang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DzikirPagi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)

        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://rumaysho.com/1636-bacaan-dzikir-pagi.html")
    }
}