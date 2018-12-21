package br.com.aula02kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalhes_crossfit.*
import kotlinx.android.synthetic.main.linha.*

class DetalhesCrossfit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_crossfit)

        val intent = intent
        intent.run {


            val crossfit = intent.getSerializableExtra("crossfit") as Crossfit

            val foto = imagemexercicio
            val nome = nome
            val descricao = descricaoexercicio


            foto.setImageResource(crossfit.img)

            //nome.text = crossfit.nome
            //descricao.text = crossfit.descricao


        }
    }
}
