package com.example.startdagger2.example2.di

import com.example.startdagger2.example2.data.repository.ExampleRepositoryImpl
import com.example.startdagger2.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {
    @Provides
    fun provideExampleRepository(impl: ExampleRepositoryImpl): ExampleRepository = impl

}