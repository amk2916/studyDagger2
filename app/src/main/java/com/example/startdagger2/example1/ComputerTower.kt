package com.example.startdagger2.example1

import javax.inject.Inject

//зависимости создаем не сами, а посталяем в конструктор
class ComputerTower(
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
)