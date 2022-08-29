package com.nasagallery

import android.app.Application
import com.nasagallery.di.applicationModule
import com.nasagallery.di.repositoryModules
import com.nasagallery.di.serviceModules
import com.nasagallery.di.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NasaGalleryApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@NasaGalleryApplication)
            modules(listOf(applicationModule, serviceModules, repositoryModules, viewModelModules))
        }
    }
}