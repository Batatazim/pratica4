package atividade.pratica4.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import atividade.pratica4.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("LoginScreen")
        setContentView(R.layout.activity_login)

        val botao = findViewById<Button>(R.id.button3)
        botao.setOnClickListener {
            val intent = Intent(this, Lista::class.java)
            startActivity(intent)
        }
        val botaocadastro = findViewById<Button>(R.id.botaocadastrar)
        botaocadastro.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
    }
}