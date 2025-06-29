package com.example.jptest.ui.song

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.jptest.ui.network.Post
import com.example.jptest.ui.network.RetrofitInstance
import kotlinx.coroutines.launch


class songViewModel : ViewModel() {
    private val _count = MutableLiveData(0)
    val count: LiveData<Int> get() = _count
    fun increment() { _count.value = _count.value!! + 1 }

    private val _post = mutableStateOf<Post?>(null)
    val post: State<Post?> = _post
    fun fetchPost() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.apiService.getPost() // 假设的Retrofit调用
                Log.d("Request", "fetchPost: ${response}",)
            } catch (e: Exception) {
                Log.e("Request", "Failed: ${e.message}") // 打印失败日志
            }
        }
    }
}