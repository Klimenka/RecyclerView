package com.example.exercise3

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val item = intent.getSerializableExtra("MyItem") as MyItem
        setContentView(R.layout.activity_detail)
        val title = findViewById<TextView>(R.id.recyclerViewTitleDetailed)
        val image = findViewById<ImageView>(R.id.recyclerViewImageDetailed)
        val description = findViewById<TextView>(R.id.recyclerViewTextDetailed)
        title.text = item.title
        description.text = item.description
        image.setBackgroundColor(item.color)
        Log.i("Detail", "Open article with id ${item.title}")
    }
}