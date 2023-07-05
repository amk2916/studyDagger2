package com.example.startdagger2.example1
//типа Активити, доступа в конструктор нет
class Activity {

    val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()

    val computerTower = ComputerTower(
        Storage(),
        Memory(),
        Processor()
    )

    val computer = Computer(monitor, computerTower, keyboard, mouse)
}