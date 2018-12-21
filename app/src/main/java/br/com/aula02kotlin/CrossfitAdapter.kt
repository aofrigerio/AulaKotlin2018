package br.com.aula02kotlin

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CrossfitAdapter(context: Context, lista: ArrayList<Crossfit>) : BaseAdapter() {

    private var listaCrossfit: ArrayList<Crossfit> = lista
    private var inflator: LayoutInflater

    init {
        this.inflator = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return this.listaCrossfit.size
    }

    override fun getItem(position: Int): Any? {
        return this.listaCrossfit.get(position)
    }

    override fun getItemId(position: Int): Long {
        return this.listaCrossfit.get(position).id;
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val crossfit = this.listaCrossfit.get(position)
        val view = this.inflator.inflate(R.layout.linha_crossfit, parent, false)

            (view.findViewById<ImageView>(R.id.image)).setImageResource(crossfit.img)

            (view.findViewById<TextView>(R.id.nome)).text = crossfit.nome
            (view.findViewById<TextView>(R.id.peso)).text = crossfit.peso.toString()
            (view.findViewById<TextView>(R.id.serie)).text = crossfit.serie.toString()
            (view.findViewById<TextView>(R.id.repeticao)).text = crossfit.repeticao.toString()


        return view
    }

}