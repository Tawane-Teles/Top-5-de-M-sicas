package com.tawane.fortniteoulol.adapter

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tawane.fortniteoulol.R
import com.tawane.fortniteoulol.model.ItemList
import com.tawane.fortniteoulol.utils.Constant.MANHOSINHO
import com.tawane.fortniteoulol.utils.Constant.CELINHA
import com.tawane.fortniteoulol.utils.Constant.PIRULITINHA
import com.tawane.fortniteoulol.utils.Constant.ISOLDINHA

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

        if (holder.name.text == MANHOSINHO) {
            holder.name.setOnClickListener {
                openNetwork("", "", "https://www.youtube.com/watch?v=mrj5rm5EC0c", ctx)
            }
        }
        if (holder.name.text == CELINHA) {
            holder.button.setOnClickListener {
                openNetwork("", "", "https://www.youtube.com/watch?v=QF-j1dKDBP0", ctx)
            }
        }
        if (holder.name.text == PIRULITINHA) {
            holder.button.setOnClickListener {
                openNetwork("", "", "https://www.youtube.com/watch?v=U48d7MnF8SY", ctx)
            }
        }
        if (holder.name.text == ISOLDINHA) {
            holder.button.setOnClickListener {
                openNetwork("", "", "https://www.youtube.com/watch?v=zkBcr13UzrI", ctx)
            }
        }
    }

    private fun openNetwork(
        appPackage: String,
        appAddress: String,
        webAddress: String,
        context: Context
    ) {

        val uri = Uri.parse(appAddress)
        val intent = Intent(Intent.ACTION_VIEW, uri)

        intent.setPackage(appPackage)

        try {
            context.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            /*
             * Se não houver o aplicativo da rede
             * social acionada, então abra a página
             * no navegador padrão do aparelho, Web.
             * */
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(webAddress)
                )
            )
        }
    }

    // Devolve quantidade de itens do nameList
    override fun getItemCount(): Int {
        return nameList.size
    }

    // Aqui é a criação dos itens do viewholder
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name = view.findViewById<TextView>(R.id.texto_logo)!!
        var subtxt = view.findViewById<TextView>(R.id.texto_logo)!!
        var imagem = view.findViewById<ImageView>(R.id.imgFortlol)!!
        var button = view.findViewById<Button>(R.id.button_links)
    }
}
