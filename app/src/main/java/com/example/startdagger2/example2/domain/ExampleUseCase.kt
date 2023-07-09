package com.example.startdagger2.example2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}