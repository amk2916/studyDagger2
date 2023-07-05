package com.example.startdagger2.example1
//типа Активити, доступа в конструктор нет
class Activity {

    val computer: Computer = Component().getComputer()
}