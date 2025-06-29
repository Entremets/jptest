package com.example.jptest.ui.network

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

object RetrofitInstance {

    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"  // 服务器地址

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) // 使用 Gson 转换器
            .build()
            .create(ApiService::class.java)
    }
}
