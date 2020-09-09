package com.example.exercise3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    companion object {
        const val ARTICLE_ID = "article_id"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val articleId = intent.getIntExtra(ARTICLE_ID, 0)
        Log.i("Detail", "Open article with id $articleId")
    }
}