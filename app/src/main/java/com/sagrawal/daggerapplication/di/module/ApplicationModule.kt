package com.sagrawal.daggerapplication.di.module

import android.content.Context
import com.sagrawal.daggerapplication.MyApplication
import com.sagrawal.daggerapplication.data.local.FileStorageService
import com.sagrawal.daggerapplication.data.remote.HttpClient
import com.sagrawal.daggerapplication.di.ApplicationContext
import com.sagrawal.daggerapplication.di.ApplicationScope
import com.sagrawal.daggerapplication.di.DatabaseName
import com.sagrawal.daggerapplication.di.DatabaseVersion
import com.sagrawal.daggerapplication.di.NetworkApiKey
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @ApplicationScope
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkApiKey
    fun provideApiKey(): String = "SOME_API_KEY"

    @ApplicationScope
    @Provides
    fun provideFileStorageService(): FileStorageService {
        return FileStorageService()
    }
}