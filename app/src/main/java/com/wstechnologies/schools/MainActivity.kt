package com.wstechnologies.schools

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.txt1).setText("Haroun : feauture1")
        findViewById<TextView>(R.id.txt2).setText("Hayet : feature2")
        findViewById<TextView>(R.id.txt3).setText("Hayet : feature3")

    }
}