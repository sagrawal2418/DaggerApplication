package com.sagrawal.daggerapplication.ui.main

import com.sagrawal.daggerapplication.data.local.DatabaseService
import com.sagrawal.daggerapplication.data.remote.NetworkService
import com.sagrawal.daggerapplication.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: " + networkService.hashCode()
    }

}