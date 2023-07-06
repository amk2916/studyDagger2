package com.example.startdagger2.example1
//типа Активити, доступа в конструктор нет
class Activity {

    lateinit var computer: Computer
    lateinit var monitor: Monitor

    init {
        Component().inject(this)
    }
}