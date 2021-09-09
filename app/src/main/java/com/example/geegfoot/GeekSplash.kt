package com.example.geegfoot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class GeekSplash : Fragment() {

    companion object {
        fun newInstance() = GeekSplash()
    }

    private lateinit var viewModel: GeekSplashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.geek_splash_fragment, container, false)
    }

}