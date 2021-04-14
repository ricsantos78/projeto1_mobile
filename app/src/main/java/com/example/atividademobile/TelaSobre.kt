package com.example.atividademobile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tela_sobre.*

class TelaSobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_sobre)

        btSite.setOnClickListener {
            val url = "http://www.uninassau.edu.br"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse (url)
            startActivity (i)
        }
    }
}