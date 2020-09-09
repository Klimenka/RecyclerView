package com.example.exercise3

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item.view.*
import java.util.*


class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind (item: MyItem) {
        itemView.recyclerViewTitle.text = item.title
        itemView.recyclerViewText.text = item.description
        val rnd = Random()
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        itemView.recyclerViewImage.setBackgroundColor(color)

    }
}