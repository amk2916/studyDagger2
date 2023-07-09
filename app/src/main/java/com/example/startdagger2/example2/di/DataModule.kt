package com.example.startdagger2.example2.di

import com.example.startdagger2.example2.data.datasource.ExampleLocalDataSource
import com.example.startdagger2.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.startdagger2.example2.data.datasource.ExampleRemoteDataSource
import com.example.startdagger2.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.startdagger2.example2.data.repository.ExampleRepositoryImpl
import com.example.startdagger2.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource = impl

    @Provides
    fun provideExampleRemoteDataSource(impl:ExampleRemoteDataSourceImpl): ExampleRemoteDataSource = impl
}