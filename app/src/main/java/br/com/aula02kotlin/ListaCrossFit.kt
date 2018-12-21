package br.com.aula02kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.listacrossfit.*

class ListaCrossFit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listacrossfit)



        val listaCrossfit = ArrayList<Crossfit>()

        val c1 = Crossfit(1,"Snatch",10,3,45,"É o clássico levantamento de peso (arranque): tira a barra do chão e leva para cima da cabeça em um movimento único, finalizando com a completa extensão do quadril.",R.drawable.snatch)
        val c2 = Crossfit(1,"Deadlift",10,3,45,"Levantamento terra em que a base dos pés é bem aberta e as mãos alcançam a barra com os braços entre os joelhos (no levantamento terra padrão os braços alcançam a barra por fora dos joelhos).",R.drawable.deadlift)
        val c3 = Crossfit(1,"Shoulder press",10,3,45,"Desenvolvimento em pé, da barra olímpica, saindo do ombro e terminando com a barra acima da cabeça, com os cotovelos estendidos.",R.drawable.shoulderpress)
        val c4 = Crossfit(1,"Burpee",10,3,45,"Um dos movimentos mais clássicos do CrossFit, onde você começa em pé, deita para fazer uma flexão e se levanta saltando e batendo as mãos acima ou atrás da cabeça.",R.drawable.burpee)


        listaCrossfit.add(c1)
        listaCrossfit.add(c2)
        listaCrossfit.add(c3)
        listaCrossfit.add(c4)

        val adapter = CrossfitAdapter(applicationContext, listaCrossfit)

        val lista = listacrossfit
        lista.adapter = adapter

        //Listen na
        lista.setOnItemClickListener {parent, view, position, id ->

            val crossfit = listaCrossfit.get(position)

            val intent = Intent (this, DetalhesCrossfit::class.java)
            intent.putExtra("crossfit" , listaCrossfit.get(position))
            startActivity(intent)

        }


    }
}