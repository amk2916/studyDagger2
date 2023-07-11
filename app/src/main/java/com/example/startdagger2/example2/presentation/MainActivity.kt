package com.example.startdagger2.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.startdagger2.R
import com.example.startdagger2.example2.ExampleApp
import com.example.startdagger2.example2.di.DaggerAppComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        (application as ExampleApp).component
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