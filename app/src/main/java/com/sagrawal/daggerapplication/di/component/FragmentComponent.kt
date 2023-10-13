package com.sagrawal.daggerapplication.di.component

import com.sagrawal.daggerapplication.di.FragmentScope
import com.sagrawal.daggerapplication.di.module.FragmentModule
import com.sagrawal.daggerapplication.ui.home.HomeFragment
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: HomeFragment)

}