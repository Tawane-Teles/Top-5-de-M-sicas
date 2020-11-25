package com.tawane.fortniteoulol.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tawane.fortniteoulol.R
import com.tawane.fortniteoulol.model.ItemList

class ListaAdapter(nameList: List<ItemList>, private var ctx: Context) :
    RecyclerView.Adapter<ListaAdapter.ViewHolder>() {

    private var nameList: List<ItemList> = ArrayList()

    init {
        this.nameList = nameList
    }

    // Aqui é onde o viewholder é criado a partir do layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    // Nessa parte é onde se modifica o item do viewholder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = nameList[position]
        holder.name.text = item.name
        holder.imagem.setBackgroundResource(item.image)
        holder.subtxt.text = item.subTitulo
    }

    // Devolve quantidade de itens do nameList
    override fun getItemCount(): Int {
        return nameList.size
    }

    // Aqui é a criação dos itens do viewholder
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name = view.findViewById<TextView>(R.id.textoTitulo)!!
        var subtxt = view.findViewById<TextView>(R.id.txt_sub)!!
        var imagem = view.findViewById<ImageView>(R.id.imgFortlol)!!
    }
}