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
                name = "jinx",
                image = R.drawable.img_jynxperso1,
                subTitulo = "Criminosa, impulsiva e maníaca."
            )
        )
        nameList.add(
            ItemList(
                name = "Akali",
                image = R.drawable.img_akaliperso2,
                subTitulo = "Perigosa, assassina e sozinha."
            )
        )
        nameList.add(
            ItemList(
                name = "Miss Fortune",
                image = R.drawable.img_missperso3,
                subTitulo = "Impiedosa, vingativa e sedutora"
            )
        )
        nameList.add(
            ItemList(
                name = "Raven",
                image = R.drawable.img_ravenperso4,
                subTitulo = "Exilado, guerreiro e sombrio"
            )
        )
        nameList.add(
            ItemList(
                name = "Fable",
                image = R.drawable.img_fableperso5,
                subTitulo = "Simpática, doce e vulnerável"
            )
        )
    }

}
