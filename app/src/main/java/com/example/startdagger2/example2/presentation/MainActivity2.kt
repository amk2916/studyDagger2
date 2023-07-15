package com.example.startdagger2.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.startdagger2.R
import com.example.startdagger2.example2.ExampleApp
import com.example.startdagger2.example2.di.DaggerAppComponent
import javax.inject.Inject


class MainActivity2 : AppCompatActivity() {


//    @Inject
//    lateinit var viewModel: ExampleViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy{
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MainActivity2", "Name2")
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        //вызываем до метода супер, для того чтобы были проинициализированны
        //все поля
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
     }
}