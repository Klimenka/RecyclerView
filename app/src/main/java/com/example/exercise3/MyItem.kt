package com.example.exercise3
import java.io.Serializable

class MyItem  (val _title: String, val _description: String): Serializable{
    val title = _title
    val description = _description
    var color = 1

    fun setCustomColor (customColor : Int){
        color = customColor
    }
}