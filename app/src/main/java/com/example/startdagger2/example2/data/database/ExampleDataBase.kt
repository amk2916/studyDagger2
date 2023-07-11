package com.example.startdagger2.example2.data.database

import android.content.Context
import android.util.Log
import com.example.startdagger2.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleDataBase @Inject constructor(
    private val context: Context,
    private val time: Long
){

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $time $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}