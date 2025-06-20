package com.example.jptest

import android.app.Application
import com.example.jptest.data.AppContainer
import com.example.jptest.data.AppContainerImpl

class jptestApplication : Application() {
    companion object {
        const val JPTEST_APP_URI = "https://developer.android.com/jetnews"
    }

    // AppContainer instance used by the rest of classes to obtain dependencies
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl(this)
    }
}
