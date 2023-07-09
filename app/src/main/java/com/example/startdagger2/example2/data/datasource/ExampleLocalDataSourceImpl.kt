package com.example.startdagger2.example2.data.datasource

import com.example.startdagger2.example2.data.database.ExampleDataBase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDataBase
) : ExampleLocalDataSource {

    override fun method() {

        database.method()
    }
}