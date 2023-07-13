package com.example.startdagger2.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.startdagger2.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ViewModel", "$this")
    }
}