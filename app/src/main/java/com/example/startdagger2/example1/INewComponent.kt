package com.example.startdagger2.example1

import dagger.Component

@Component
interface INewComponent {

    fun inject(activity: Activity)
}