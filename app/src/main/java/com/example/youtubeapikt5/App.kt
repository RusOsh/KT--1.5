package com.example.youtubeapikt5

import android.app.Application
import com.example.youtubeapikt5.di.koinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
            modules(koinModules)
        }
    }

}