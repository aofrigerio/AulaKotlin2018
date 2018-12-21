package br.com.aula02kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.android_mesclando.*

class Jogo : AppCompatActivity() {

    var placar1soma: Int = 0
    var placar2soma: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_mesclando)

        val bandeira1 = bandeiratime1
        val placarbandeira1 = placar1

        val bandeira2 = bandeiratime2
        val placarbandeira2 = placar2

        val listadostimes = lstimes

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Jogo.contatos1)
        var lista1 = findViewById(R.id.lstimes) as ListView

        lista1.adapter = adapter


        bandeira1.setOnClickListener {

            this.placar1soma = placar1soma + 1
            placarbandeira1.text = this.placar1soma.toString()
        }

        bandeira2.setOnClickListener{

            this.placar2soma = placar2soma + 1
            placarbandeira2.text = this.placar2soma.toString()
        }

    }

    companion object {
        internal val contatos1 = arrayOf("Alline", "Lucas", "Rafael", "Gabriela", "Silvana")
    }
}
