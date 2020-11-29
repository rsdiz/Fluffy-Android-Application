package com.example.fluffy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inisialisasi komponen dari layout
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        /*
        Aksi ketika button login di klik,
        maka pindah activity ke Dashboard
        */
        buttonLogin.setOnClickListener {
            val intentDashboard = Intent(this, DashboardActivity::class.java)
            startActivity(intentDashboard)
        }
    }
}
