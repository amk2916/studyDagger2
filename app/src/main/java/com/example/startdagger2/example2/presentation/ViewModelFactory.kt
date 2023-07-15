package com.example.startdagger2.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.startdagger2.example2.di.AppScope
import javax.inject.Inject
import javax.inject.Provider


class ViewModelFactory @Inject constructor(
    private val viewModelProviders:@JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>// в качестве ключа прилетает название класс
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return viewModelProviders[modelClass]?.get() as T // создается view model того класса, название которого передали
    }
}