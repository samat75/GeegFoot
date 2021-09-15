package com.example.geegfoot.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.geegfoot.R
import com.example.geegfoot.core.BaseActivity

class AuthActivity:BaseActivity(R.layout.fragment_register) {
    private val authVM = AuthVm()
    override fun setVM(){
        authVM.checkUser(5,this)
    }
}