package com.example.startdagger2.example2.di

import com.example.startdagger2.example2.presentation.MainActivity
import com.example.startdagger2.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivitySubComponent {

    @Subcomponent.Factory
    interface SubComponentFactory {
        fun create(
            @IdKeyQualifier @BindsInstance key_id: String,
            @NameQualifier @BindsInstance name: String
        ): ActivitySubComponent
    }

    fun inject(mainActivity: MainActivity)

    fun inject(mainActivity: MainActivity2)

}