package com.example.startdagger2.example1

import javax.inject.Inject

//типа Активити, доступа в конструктор нет
class Activity {

    lateinit var computer: Computer

    @Inject
    lateinit var monitor: Monitor

    init {
        DaggerINewComponent.builder().build().inject(this)
    }
}