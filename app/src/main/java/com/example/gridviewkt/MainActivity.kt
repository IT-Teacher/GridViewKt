package com.example.gridviewkt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.example.gridviewkt.adapter.CustomAdapter

class MainActivity : AppCompatActivity() {
    lateinit var simpleGrid: GridView
    var person = intArrayOf(
        R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
        R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
        R.drawable.img10, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
        R.drawable.img5, R.drawable.img6
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleGrid = findViewById(R.id.gridview)
        val customAdapter = CustomAdapter(applicationContext, person)
        simpleGrid.setAdapter(customAdapter)

        simpleGrid.setOnItemClickListener(OnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val intent = Intent(
                this@MainActivity,
                SecondActivity::class.java
            )
            intent.putExtra("image", person[position])
            startActivity(intent)
        })
    }
}