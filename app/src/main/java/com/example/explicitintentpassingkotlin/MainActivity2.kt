package com.example.explicitintentpassingkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var textView1: TextView
    private lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView1 = findViewById(R.id.title)
        textView2 = findViewById(R.id.rollNo)

        // Getting Data Explicitly from First Activity in Key Value pairs
        // using Get (DataType) Extras and Assigning the value to the corresponding Variable

        val intent = intent
        val title = intent.getStringExtra("title")
        val rollNo = intent.getIntExtra("Roll No", 0)

        // Setting text to textViews

        textView1.text = title
        textView2.text = rollNo.toString()
    }
}

