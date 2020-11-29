package com.example.fluffy

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailBurungActivity : AppCompatActivity() {
    private lateinit var gambarView: ImageView
    private lateinit var penjelasan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_burung)

        // INISIALISASI
        gambarView = findViewById(R.id.image_bird)
        penjelasan = findViewById(R.id.description_bird)

        // MENGUBAH KONTEN
        gambarView.setImageResource(intent.getIntExtra("gambar", R.drawable.icon_owl))
        penjelasan.text = intent.getStringExtra("keterangan")
        supportActionBar?.title = intent.getStringExtra("nama")
    }
}
