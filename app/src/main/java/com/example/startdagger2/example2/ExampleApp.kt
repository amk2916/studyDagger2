package com.example.startdagger2.example2

import android.app.Application
import com.example.startdagger2.example2.di.DaggerAppComponent

class ExampleApp : Application() {
    val component by lazy {
        DaggerAppComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}
