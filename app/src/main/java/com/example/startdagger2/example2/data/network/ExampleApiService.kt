package com.example.startdagger2.example2.data.network

import android.content.Context
import android.util.Log
import com.example.startdagger2.R
import com.example.startdagger2.example2.di.AppScope
import javax.inject.Inject
import javax.inject.Singleton

@AppScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val time: Long
) {

    fun method() {
        Log.d(LOG_TAG,"ExampleApiService ${context.getString(R.string.app_name)} $time")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
