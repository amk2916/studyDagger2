package com.example.startdagger2.example1

//зависимости создаем не сами, а посталяем в конструктор
class Computer(
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
)