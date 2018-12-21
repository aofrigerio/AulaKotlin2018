package br.com.aula02kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.listacustomizada.*

class ListaCustomizada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listacustomizada)

        val listaContatos = ArrayList<Contato>()
        val c1 = Contato(1L, "Collor", "color@br.com", "Alagoas")
        val c2 = Contato(2L, "Dilma", "dilma@br.com", "Porto Alegre")

        listaContatos.add(c1)
        listaContatos.add(c2)

        val adapter = ContatoAdapter(applicationContext, listaContatos)

        val lista = lista
        lista.adapter = adapter


    }

}
