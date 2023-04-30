package com.example.appnews.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.appnews.models.Article

abstract class ArticleDB : RoomDatabase() {

    abstract fun getArticleDao(): Dao

    companion object{
        @Volatile
        private var instance: ArticleDB? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance ?: createDB(context).also { instance = it }
        }

        private fun createDB(context: Context) : ArticleDB {
            return Room.databaseBuilder(
                context.applicationContext,
                ArticleDB::class.java,
                "article_db"
            ).build()
        }
    }
}