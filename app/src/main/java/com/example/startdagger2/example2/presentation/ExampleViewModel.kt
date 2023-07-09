package com.example.startdagger2.example2.presentation

import com.example.startdagger2.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}