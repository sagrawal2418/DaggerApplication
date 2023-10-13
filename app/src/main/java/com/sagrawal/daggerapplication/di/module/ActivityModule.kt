package com.sagrawal.daggerapplication.di.module

import android.app.Activity
import android.content.Context
import com.sagrawal.daggerapplication.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

}