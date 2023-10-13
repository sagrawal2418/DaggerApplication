package com.sagrawal.daggerapplication.di.component

import com.sagrawal.daggerapplication.di.ActivityScope
import com.sagrawal.daggerapplication.di.module.ActivityModule
import com.sagrawal.daggerapplication.ui.main.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}
