package com.stephenone.xxplayer.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.toast

/**
 * Created by wenzhubin on 2019/7/29.
 */
abstract class BaseActivity : AppCompatActivity(),AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
        debug { "哈哈" }
    }

    open protected fun initData() {

    }

    protected fun initListener() {

    }

    abstract fun getLayoutId():Int


    protected fun myToast(msg:String){
        runOnUiThread { toast(msg) }
    }
}