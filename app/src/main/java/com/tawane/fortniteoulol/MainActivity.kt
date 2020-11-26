package com.tawane.fortniteoulol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tawane.fortniteoulol.adapter.ListaAdapter
import com.tawane.fortniteoulol.model.ItemList
import com.tawane.fortniteoulol.utils.Constant.CELINHA
import com.tawane.fortniteoulol.utils.Constant.ISOLDINHA
import com.tawane.fortniteoulol.utils.Constant.MANHOSINHO
import com.tawane.fortniteoulol.utils.Constant.PIRULITINHA


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
                name = MANHOSINHO,
                image = R.drawable.img_gatoum,
                subTitulo = "Adora um colinho \uD83D\uDC3E "
            )
        )
        nameList.add(
            ItemList(
                name = CELINHA,
                image = R.drawable.img_gatodois,
                subTitulo = "Mais discreta \uD83D\uDC3E"
            )
        )
        nameList.add(
            ItemList(
                name = PIRULITINHA,
                image = R.drawable.img_gatotres,
                subTitulo = "Mia por petisquinho \uD83D\uDC3E"
            )
        )
        nameList.add(
            ItemList(
                name = ISOLDINHA,
                image = R.drawable.img_gatoquatro,
                subTitulo = "Muito preguiçosinha \uD83D\uDC3E"
            )
        )
    }

}
