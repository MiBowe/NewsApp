package com.example.appnews.adapter

import com.example.appnews.R

open class NewsList{
    companion object{
        val newsList = mutableListOf(
            NewsItem("News1", "subtitle1", R.drawable.ic_launcher_foreground),
            NewsItem("News2", "subtitle2", R.drawable.ic_launcher_foreground),
            NewsItem("News3", "subtitle3", R.drawable.ic_launcher_foreground),
            NewsItem("News4", "subtitle4", R.drawable.ic_launcher_foreground),
            NewsItem("News5", "subtitle5", R.drawable.ic_launcher_foreground),
            NewsItem("News6", "subtitle6", R.drawable.ic_launcher_foreground),
            NewsItem("News7", "subtitle7", R.drawable.ic_launcher_foreground),
            NewsItem("News8", "subtitle8", R.drawable.ic_launcher_foreground),
            NewsItem("News9", "subtitle9", R.drawable.ic_launcher_foreground)
        )
    }
}