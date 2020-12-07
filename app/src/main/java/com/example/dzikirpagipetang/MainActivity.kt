package com.example.dzikirpagipetang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnpagi: Button = findViewById(R.id.dzikir_pagi)
        btnpagi.setOnClickListener(this)

        val btnPetang: Button = findViewById(R.id.dzikir_petang)
        btnPetang.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.dzikir_pagi ->{
                val dzikirPagi = Intent(this, DzikirPagi::class.java)
                startActivity(dzikirPagi)
            }
            R.id.dzikir_petang ->{
                val dzikirPetang = Intent(this, DzikirPetang::class.java)
                startActivity(dzikirPetang)
            }

        }
    }
}
