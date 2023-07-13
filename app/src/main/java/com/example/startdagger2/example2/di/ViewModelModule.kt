package com.example.startdagger2.example2.di

import androidx.lifecycle.ViewModel
import com.example.startdagger2.example2.presentation.ExampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @StringKey("ExampleViewModel")
    @Binds
    fun bideExampleViewModel(impl: ExampleViewModel): ViewModel
}