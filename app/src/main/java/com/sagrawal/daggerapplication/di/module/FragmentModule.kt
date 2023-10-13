package com.sagrawal.daggerapplication.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.sagrawal.daggerapplication.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = fragment.requireContext()

}
