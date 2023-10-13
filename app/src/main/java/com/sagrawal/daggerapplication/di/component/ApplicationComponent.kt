package com.sagrawal.daggerapplication.di.component

import android.content.Context
import com.sagrawal.daggerapplication.MyApplication
import com.sagrawal.daggerapplication.data.local.DatabaseService
import com.sagrawal.daggerapplication.data.local.FileStorageService
import com.sagrawal.daggerapplication.data.remote.NetworkService
import com.sagrawal.daggerapplication.di.ApplicationContext
import com.sagrawal.daggerapplication.di.ApplicationScope
import com.sagrawal.daggerapplication.di.module.ApplicationModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getFileStorageService(): FileStorageService
}