package com.example.appnews.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.*
import com.example.appnews.models.Article

@Dao
interface Dao {
    @Query("SELECT * FROM articles")
    fun getAllNews(): LiveData<List<Article>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(article: Article)

    @Delete
    fun delete(article: Article)
}