package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linerlayout)
        setTitle("LinerLayout")
    }

    fun button1_Click(view: View) {
        val button1: Button = findViewById(R.id.button2)
        val button2: Button = findViewById(R.id.button1)
        button1.visibility = View.GONE
        button2.visibility = View.VISIBLE
    }

    fun button2_Click(view: View) {
        val button1: Button = findViewById(R.id.button2)
        val button2: Button = findViewById(R.id.button1)
        button1.visibility = View.VISIBLE
        button2.visibility = View.GONE
    }

    fun button3_Click(view: View) {
        val textView2: TextView = findViewById(R.id.textView2)
        textView2.setText("Вертикальная")
    }

    fun button4_Click(view: View) {
        val textView4: TextView = findViewById(R.id.textView4)
        textView4.setText("По левой границе")
    }

    fun button5_Click(view: View) {
        val textView2: TextView = findViewById(R.id.textView2)
        textView2.setText("Горизонтальная")
    }

    fun button6_Click(view: View) {
        val textView4: TextView = findViewById(R.id.textView4)
        textView4.setText("По центру")
    }

    fun button7_Click(view: View) {
        val textView2: TextView = findViewById(R.id.textView2)
        textView2.setText("Вертикальная")
    }

    fun button8_Click(view: View) {
        val textView4: TextView = findViewById(R.id.textView4)
        textView4.setText("По правой границе")
    }
}