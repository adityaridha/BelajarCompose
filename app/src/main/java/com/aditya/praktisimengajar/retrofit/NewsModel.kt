package com.aditya.praktisimengajar.retrofit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aditya.praktisimengajar.retrofit.network.NewsApi
import com.aditya.praktisimengajar.retrofit.network.NewsApiService
import kotlinx.coroutines.launch

class NewsModel: ViewModel() {
    fun getTopHeadlines() {
        viewModelScope.launch {
            val response = NewsApi.retrofitService.getTopHeadline()
            Log.d("response", response)
        }
    }

}