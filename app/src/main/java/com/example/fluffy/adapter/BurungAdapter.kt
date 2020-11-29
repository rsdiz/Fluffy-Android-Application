package com.example.fluffy.adapter

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.fluffy.R

class BurungAdapter (var myContext: Context, var resources: Int, var items:List<ModelBurung>):
    ArrayAdapter<ModelBurung>(myContext,resources,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(myContext)
        val view:View = layoutInflater.inflate(resources, null)

        //inisialisasi
        val imageView: ImageView = view.findViewById(R.id.img)
        val titleView: TextView = view.findViewById(R.id.txt_judul)

        //data
        val modelItem: ModelBurung = items[position]
        imageView.setImageDrawable(myContext.resources.getDrawable(modelItem.gambar))
        titleView.text = modelItem.nama;

        return view
    }
}