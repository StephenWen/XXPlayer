package com.stephenone.xxplayer.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stephenone.xxplayer.R

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
