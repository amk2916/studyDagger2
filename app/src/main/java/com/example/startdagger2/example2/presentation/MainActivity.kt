package com.example.startdagger2.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.startdagger2.R
import com.example.startdagger2.example1.Activity
import com.example.startdagger2.example2.di.DaggerAppComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var viewModel: ExampleViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        //вызываем до метода супер, для того чтобы были проинициализированны
        //все поля
        DaggerAppComponent.builder().build().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}