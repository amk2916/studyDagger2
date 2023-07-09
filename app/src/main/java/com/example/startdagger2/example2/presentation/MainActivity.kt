package com.example.startdagger2.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.startdagger2.R
import com.example.startdagger2.example1.Activity


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}