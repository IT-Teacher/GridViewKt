package com.example.gridviewkt

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    lateinit var selectedImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        selectedImage = findViewById<ImageView>(R.id.selectedImage)
        val intent = intent
        selectedImage.setImageResource(intent.getIntExtra("image", 0))
    }
}
