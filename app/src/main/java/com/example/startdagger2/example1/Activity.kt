package com.example.startdagger2.example1

import javax.inject.Inject

//типа Активити, доступа в конструктор нет
class Activity {


    @Inject
    lateinit var computer: Computer

    init {
        DaggerINewComponent.builder().build().inject(this)
    }
}