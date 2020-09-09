package com.example.exercise3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        val content = arrayListOf<MyItem>()
        for (i in 1..20){
            content.add(MyItem("ListItem $i", "Short introduction of the text from listItem $i to draw the attention of the user"))
        }
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = MyAdapter(this, content)
    }
}