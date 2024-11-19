package com.example.project.assignmentno4

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private var counter = 0 // Counter for Button 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Button 1: Change TextView text
        button1.setOnClickListener {
            counter++
            textView.text = "Button 1 clicked $counter times"
        }

        // Button 2: Change TextView height
        button2.setOnClickListener {
            textView.height = textView.height + 50 // Increase height by 50 pixels
        }

        // Button 3: Center TextView on the screen
        button3.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }
    }
}
