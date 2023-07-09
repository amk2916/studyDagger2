package com.example.startdagger2.example2.di

import com.example.startdagger2.example2.data.repository.ExampleRepositoryImpl
import com.example.startdagger2.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {
    @Binds
    fun bindExampleRepository(
        impl: ExampleRepositoryImpl
    ): ExampleRepository

}