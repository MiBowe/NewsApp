package com.example.appnews.screens.main_fragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appnews.data.api.TestRepo
import com.example.appnews.models.NewsResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainFragmentVM @Inject constructor(private val repo: TestRepo): ViewModel() {

    private val _all = MutableLiveData<NewsResponse>()
    val all : LiveData<NewsResponse>
        get() = _all

    init {
        getAll()
    }

    private fun getAll() = viewModelScope.launch {
        repo.getAll().let {
            if (it.isSuccessful){
                _all.postValue(it.body())
            } else {
                Log.d("testGet","Failed to load news: ${it.errorBody()}")
            }
        }
    }

}