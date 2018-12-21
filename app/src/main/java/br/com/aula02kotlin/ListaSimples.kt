package br.com.aula02kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.android_lista_simples.*

class ListaSimples : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_lista_simples)

        var listaSimples = lscontats

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contatos)

        var lista = findViewById(R.id.lscontats) as ListView

        lista.adapter = adapter

    }

    companion object {
        internal val contatos = arrayOf("Alline", "Lucas", "Rafael", "Gabriela", "Silvana")
    }
}