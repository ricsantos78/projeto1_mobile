package com.example.atividademobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.atividademobile.ui.login.TelaLogin
import kotlinx.android.synthetic.main.activity_tela_inicial.*

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)


        btLogin.setOnClickListener {
            val intent = Intent(this, TelaLogin::class.java)
            startActivity (intent)
        }
        btCadastro.setOnClickListener {
            val intent = Intent(this, TelaCadastro::class.java)
            startActivity(intent)
        }

        btSobre.setOnClickListener {
            val intent = Intent(this, TelaSobre::class.java)
            startActivity(intent)
        }
    }
}