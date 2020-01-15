package com.stephenone.xxplayer.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 * Created by wenzhubin on 2019-08-03.
 */
abstract class BaseFragment : Fragment(),AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        debug { "哈哈" }
    }

    protected fun init() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return initView()
    }

    abstract fun initView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    protected fun initData() {

    }

    protected fun initListener() {

    }

    fun myToast(msg:String){
        context?.runOnUiThread { toast(msg) }
    }
}