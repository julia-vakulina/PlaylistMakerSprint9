package com.example.playlistmaker

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val button_left = findViewById<Button>(R.id.button_left)
        button_left.setOnClickListener {
            val leftIntent = Intent(this, MainActivity::class.java)
            startActivity(leftIntent)

        }
    }
}