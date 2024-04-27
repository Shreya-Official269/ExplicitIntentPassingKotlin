package com.example.explicitintentpassingkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.Button)

        button.setOnClickListener {
            // Explicit Intent Passing
            val intent = Intent(this, MainActivity2::class.java)

            // Passing Data explicitly to Second Activity in Key Value Pair using Put Extras
            intent.putExtra("Title", "Home")
            intent.putExtra("Roll No", 10)

            // Starting the next Activity
            startActivity(intent)
        }
    }
}


