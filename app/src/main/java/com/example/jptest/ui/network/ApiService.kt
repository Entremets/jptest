package com.example.jptest.ui.network

import retrofit2.http.GET

interface ApiService {
    @GET("posts/1")
    suspend fun getPost(): Post // 使用协程挂起函数
}
