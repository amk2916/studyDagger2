package com.example.startdagger2.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface INewComponent {

    fun getMonitor():Monitor

    fun inject(activity: Activity)
}