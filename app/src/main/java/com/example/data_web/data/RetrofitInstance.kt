package com.example.data_web.data

import com.example.data_web.network.CatFactsApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInstance {
    private val baseURL = "https://catfact.ninja/";

    val retrofitClient = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofitClient.create(CatFactsApi::class.java)
}