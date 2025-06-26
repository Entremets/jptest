package com.example.jptest

import android.app.Application

class jptestApplication : Application() {
    companion object {
        const val JPTEST_APP_URI = "https://developer.android.com/jetnews"
    }

    override fun onCreate() {
        super.onCreate()
    }
}
