package com.example.fluffy

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Inisialisasi komponen pada layout
        val buttonFacebook = findViewById<LinearLayout>(R.id.buttonFacebook)
        val buttonEmail = findViewById<LinearLayout>(R.id.buttonEmail)
        val buttonLogin = findViewById<TextView>(R.id.buttonLogin)

        /*
        Aksi ketika button facebook di klik,
        maka pindah activity ke Dashboard
        */
        buttonFacebook.setOnClickListener {
            val intentDashboard = Intent(this, DashboardActivity::class.java)
            startActivity(intentDashboard)
        }
        /*
        Aksi ketika button email di klik,
        maka pindah activity ke Signup
        */
        buttonEmail.setOnClickListener {
            val intentSignup = Intent(this, SignupActivity::class.java)
            startActivity(intentSignup)
        }
        /*
        Aksi ketika text login di klik,
        maka pindah activity ke Login
        */
        buttonLogin.setOnClickListener {
            val intentLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentLogin)
        }
    }
}
