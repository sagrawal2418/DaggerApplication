package com.sagrawal.daggerapplication

import android.app.Application
import com.sagrawal.daggerapplication.data.local.DatabaseService
import com.sagrawal.daggerapplication.data.remote.NetworkService
import com.sagrawal.daggerapplication.di.component.ApplicationComponent
import com.sagrawal.daggerapplication.di.component.DaggerApplicationComponent
import com.sagrawal.daggerapplication.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}