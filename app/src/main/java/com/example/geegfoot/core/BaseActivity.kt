package com.example.geegfoot.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity(private val layout:Int):AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
        setView()
        setVM()
    }

    open fun setVM() {

    }

    open fun setView() {

    }
}