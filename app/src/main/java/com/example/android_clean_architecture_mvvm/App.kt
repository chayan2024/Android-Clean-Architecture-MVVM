package com.example.android_clean_architecture_mvvm

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App :Application(){

    override fun onCreate() {
        super.onCreate()
    }
}