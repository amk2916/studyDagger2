package com.example.startdagger2.example2.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val application: Application) {
    @Provides
    fun provideContext():Context = application
}