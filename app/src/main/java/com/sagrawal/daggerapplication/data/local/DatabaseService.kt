package com.sagrawal.daggerapplication.data.local

import android.content.Context
import com.sagrawal.daggerapplication.di.ApplicationContext
import com.sagrawal.daggerapplication.di.ApplicationScope
import com.sagrawal.daggerapplication.di.DatabaseName
import com.sagrawal.daggerapplication.di.DatabaseVersion
import javax.inject.Inject

@ApplicationScope
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val version: Int
) {

    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }

}