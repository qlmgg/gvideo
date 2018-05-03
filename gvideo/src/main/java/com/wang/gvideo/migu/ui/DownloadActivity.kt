package com.wang.gvideo.migu.ui

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.transition.Fade
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import com.wang.gvideo.R
import com.wang.gvideo.common.base.BaseActivity

/**
 * Date:2018/5/3
 * Description:
 *
 * @author wangguang.
 */
class DownloadActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_download)
        initHeadBar()
    }

    private fun initHeadBar() {
        window.enterTransition = Fade()
        window.exitTransition = Fade()
        supportActionBar?.apply {
            val headerView = LayoutInflater.from(this@DownloadActivity).inflate(R.layout.header_download_layout, null)
            val firstView = headerView.findViewById<ImageView>(R.id.header_right_ic)
            firstView.setOnClickListener {
                showMsg("edit")
            }
            var parmas = ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT,
                    Gravity.CENTER_VERTICAL or Gravity.RIGHT)
            displayOptions = displayOptions or ActionBar.DISPLAY_SHOW_CUSTOM
            setCustomView(headerView, parmas)
            title = "下载中心"
        }
    }
}