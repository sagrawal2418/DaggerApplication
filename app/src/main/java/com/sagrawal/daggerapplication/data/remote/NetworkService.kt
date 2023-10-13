package com.sagrawal.daggerapplication.data.remote

import android.content.Context
import com.sagrawal.daggerapplication.di.ApplicationContext
import com.sagrawal.daggerapplication.di.NetworkApiKey
import javax.inject.Inject

class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val apiKey: String
) {

    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }

}
