package com.example.fluffy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.fluffy.adapter.BurungAdapter
import com.example.fluffy.adapter.ModelBurung

class activity_dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //inisialisasi
        var listView:ListView = findViewById(R.id.listView)

        //data source
        var data = mutableListOf<ModelBurung>()
        data.add(ModelBurung(R.drawable.icon_lovebird, "BURUNG LOVEBIRD", ""))
        data.add(ModelBurung(R.drawable.icon_cendet, "BURUNG CENDET", ""))
        data.add(ModelBurung(R.drawable.icon_kacer, "BURUNG KACER", ""))
        data.add(ModelBurung(R.drawable.icon_kenari, "BURUNG KENARI", ""))
        data.add(ModelBurung(R.drawable.icon_muraibatu, "BURUNG MURAI BATU", ""))

        //ADAPTER
        listView.adapter = BurungAdapter(this, R.layout.row, data)

        //ACTION
        listView.setOnItemClickListener { parent, view, position, id ->
           var item=data[position]
            intent=Intent(this, activity_detail::class.java)
            intent.putExtra("gambar", item.gambar)
            intent.putExtra("nama", item.nama)
            intent.putExtra("keterangan", item.keterangan)
            startActivity(intent)
        }
    }
}