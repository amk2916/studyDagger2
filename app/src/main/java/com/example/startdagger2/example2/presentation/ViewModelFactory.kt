package com.example.startdagger2.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.startdagger2.example2.domain.ExampleUseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val viewModels:@JvmSuppressWildcards Map<String, ViewModel>// в качестве ключа прилетает название класс
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return viewModels[modelClass.simpleName] as T // создается view model того класса, название которого передали
    }
}