package com.tawane.fortniteoulol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tawane.fortniteoulol.adapter.ListaAdapter
import com.tawane.fortniteoulol.model.ItemList


class MainActivity : AppCompatActivity() {
    var listaAdapter: ListaAdapter? = null
    var linearLayoutManager: LinearLayoutManager? = null
    var nameList = ArrayList<ItemList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list: RecyclerView = findViewById(R.id.recyclerview)

        getList()
        listaAdapter = ListaAdapter(nameList, this)
        linearLayoutManager = LinearLayoutManager(this)
        list.layoutManager = linearLayoutManager
        list.adapter = listaAdapter
        list.adapter
    }

    private fun getList() {
        nameList.add(
            ItemList(
                name = "Liu",
                image = R.drawable.img_liu,
                subTitulo = "Nave Espacial"
            )
        )
        nameList.add(
            ItemList(
                name = "Alok",
                image = R.drawable.img_alok,
                subTitulo = "Hear Me Now"
            )
        )
        nameList.add(
            ItemList(
                name = "Coldplay",
                image = R.drawable.img_coldplay,
                subTitulo = "A Sky Full Of Stars"
            )
        )
        nameList.add(
            ItemList(
                name = "The Killers",
                image = R.drawable.img_thekillers,
                subTitulo = "Human"
            )
        )
        nameList.add(
            ItemList(
                name = "Drake",
                image = R.drawable.img_drake,
                subTitulo = "Hotline Bling"
            )
        )
    }

}
