package com.example.startdagger2.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun provideMonitor():Monitor{
        return Monitor()
    }
    @Provides
    fun provideMouse():Mouse{
        return Mouse()
    }
    @Provides
    fun provideKeyboard():Keyboard{
        return Keyboard()
    }

    @Provides
    fun provideMemory():Memory = Memory()

    @Provides
    fun provideProcessor():Processor = Processor()

    @Provides
    fun provideStorage():Storage = Storage()

    @Provides
    fun computerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ):ComputerTower = ComputerTower(storage, memory, processor)




    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        mouse: Mouse,
        keyboard: Keyboard
    ) : Computer{
        return Computer(monitor, computerTower, keyboard, mouse)
    }
}