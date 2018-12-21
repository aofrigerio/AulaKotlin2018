package br.com.aula02kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, Jogo::class.java)
        val intent2 = Intent( this, ListaSimples::class.java)
        val intent3 = Intent( this, ListaCustomizada::class.java)
        val intent4 = Intent (this, ListaCrossFit::class.java)

        val botao = button
        val btnlista = btnlista
        val btnlistacustomizada = btncustomizada
        val btncrossfit = btncrossfit


        botao.setOnClickListener {
               startActivity(intent)
        }

        btnlista.setOnClickListener {
                startActivity(intent2)
        }

        btnlistacustomizada.setOnClickListener {
            startActivity(intent3)
        }

        btncrossfit.setOnClickListener {

            startActivity(intent4)
        }


    }
}
