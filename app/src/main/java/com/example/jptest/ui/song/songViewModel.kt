package com.example.jptest.ui.song

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData



class songViewModel : ViewModel() {
    private val _count = MutableLiveData(0)
    val count: LiveData<Int> get() = _count
    fun increment() { _count.value = _count.value!! + 1 }
}