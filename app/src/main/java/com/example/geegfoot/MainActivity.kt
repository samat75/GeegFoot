package com.example.geegfoot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geegfoot.core.BaseActivity
import com.example.geegfoot.ui.AuthActivity

class MainActivity : BaseActivity(R.layout.activity_main) {
    override fun setVM() {
        val inent = Intent(this@MainActivity,AuthActivity::class.java)
        startActivity(inent)
    }
}