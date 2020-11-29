package com.example.fluffy

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.fluffy.adapter.BurungAdapter
import com.example.fluffy.adapter.ModelBurung

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // inisialisasi
        val listView: ListView = findViewById(R.id.listView)

        // data source
        val data = mutableListOf<ModelBurung>()
        data.add(ModelBurung(R.drawable.icon_lovebird, "BURUNG LOVEBIRD", "Burung lovebird adalah satu burung dari sembilan jenis spesies genus Agapornis. Mereka adalah burung yang berukuran kecil, antara 13 sampai 17 cm dengan berat 40 hingga 60 gram, dan bersifat sosial. Delapan dari spesies ini berasal dari Afrika, sementara spesies burung cinta kepala abu-abu berasal dari Madagaskar."))
        data.add(ModelBurung(R.drawable.icon_cendet, "BURUNG CENDET", "Bentet cendet adalah spesies burung dari keluarga Laniidae, dari genus Lanius. Burung ini merupakan jenis burung pemakan belalang, kumbang, tonggeret, serangga besa dan memiliki habitat di daerah terbuka, padang rumput, perkebunan, tegalan. tersebar sampai ketinggian 1.600 m dpl."))
        data.add(ModelBurung(R.drawable.icon_kacer, "BURUNG KACER", "Burung kacer adalah burung pengicau kecil yang sebelumnya dikelompokkan sebagai anggota keluarga Turdidae, tetapi kini dianggap sebaagi anggota Muscicapidae. Burung ini berwarna hitam dan putih dengan ekor yang panjang."))
        data.add(ModelBurung(R.drawable.icon_kenari, "BURUNG KENARI", "Burung kenari pertama ditemukan Oleh Pelaut Prancis Jean de Berthan Cout di Kepulauan Canary pada abad ke-15."))
        data.add(ModelBurung(R.drawable.icon_muraibatu, "BURUNG MURAI BATU", "Burung murai batu juga dikenal sebagai Kucica hutan Termasuk ke dalam famili Muscicapidae atau burung cacing. Tersebar di seluruh pulau Sumatra, Semenanjung Malaysia, dan sebagian pulau Jawa. Beberapa pakar menganggap ras dari Kalimantan Utara Murai alis putih sebagai spesies tersendiri."))

        // ADAPTER
        listView.adapter = BurungAdapter(this, R.layout.row, data)

        // ACTION
        listView.setOnItemClickListener { parent, view, position, id ->
            val item = data[position]
            intent = Intent(this, DetailBurungActivity::class.java)
            intent.putExtra("gambar", item.gambar)
            intent.putExtra("nama", item.nama)
            intent.putExtra("keterangan", item.keterangan)
            startActivity(intent)
        }
    }
}
