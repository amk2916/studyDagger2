package com.example.startdagger2.example2.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.startdagger2.R
import com.example.startdagger2.example2.ExampleApp
import com.example.startdagger2.example2.di.DaggerAppComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


//    @Inject
//    lateinit var viewModel: ExampleViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val textView by lazy{
        findViewById<TextView>(R.id.twHello_world)
    }
    private val viewModel by lazy{
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MainActivity")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //вызываем до метода супер, для того чтобы были проинициализированны
        //все поля
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()

        textView.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
     }
}