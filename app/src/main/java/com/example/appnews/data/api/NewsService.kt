package com.example.appnews.data.api

import com.example.appnews.models.NewsResponse
import com.example.appnews.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("/v2/everything")
    suspend fun getNews(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ) : Response<NewsResponse>
    @GET("/v2/top-headlines")
    suspend fun getCountryNews(
        @Query("apiKey") apiKey: String = API_KEY,
        @Query("page") page: Int = 1,
        @Query("country") country: String = "ru"
    ) : Response<NewsResponse>
}