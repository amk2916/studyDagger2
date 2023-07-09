package com.example.startdagger2.example2.data.datasource

import com.example.startdagger2.example2.data.database.ExampleDataBase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDataBase
) : ExampleLocalDataSource {

    override fun method() {

        database.method()
    }
}