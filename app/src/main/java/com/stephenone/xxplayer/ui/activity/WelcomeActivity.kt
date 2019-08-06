package com.stephenone.xxplayer.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.stephenone.xxplayer.R
import com.stephenone.xxplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_welcome.*
import org.jetbrains.anko.startActivity

/**
 * Created by wenzhubin on 2019-08-03.
 */
class WelcomeActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_welcome
    }

    override fun initData() {
        ViewCompat.animate(iv_bg).scaleX(1.0f).scaleY(1.0f).setDuration(2000).setListener(
            object : ViewPropertyAnimatorListener{
                override fun onAnimationEnd(p0: View?) {
                    startActivity<MainActivity>()
//                    startActivity(Intent(this@WelcomeActivity,MainActivity::class.java))
                    finish()
                }

                override fun onAnimationCancel(p0: View?) {

                }

                override fun onAnimationStart(p0: View?) {

                }

            })
    }
}