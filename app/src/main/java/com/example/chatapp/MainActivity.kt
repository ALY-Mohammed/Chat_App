package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var creata:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        creata=findViewById(R.id.createAccount)
        creata.setOnClickListener {
            val intent=Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }

    }
}