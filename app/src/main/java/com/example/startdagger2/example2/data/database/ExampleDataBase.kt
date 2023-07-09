package com.example.startdagger2.example2.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDataBase @Inject constructor(){

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}