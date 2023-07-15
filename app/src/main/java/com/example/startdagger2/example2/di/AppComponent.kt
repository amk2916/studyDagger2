package com.example.startdagger2.example2.di

import android.content.Context
import com.example.startdagger2.example2.presentation.MainActivity
import com.example.startdagger2.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@AppScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent{

    fun activityComponentFactory():ActivitySubComponent.SubComponentFactory

    @Component.Factory
    interface AppComponentFactory{
        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ):AppComponent
    }
}