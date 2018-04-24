package com.wang.gvideo.migu.setting

import com.wang.gvideo.common.utils.SharedPreferencesUtil

/**
 * Date:2018/4/14
 * Description:
 *
 * @author wangguang.
 */
object Prefences {
    const val DEFINIITION_PREFENCE_KEY = "definiition_prefence_key"
    const val DEFINIITION_RATE_PREFENCE_KEY = "definiition_rate_prefence_key"

    fun selectDefiniitionPrefence(pos: Int) {
        SharedPreferencesUtil.instance.setInt(DEFINIITION_PREFENCE_KEY, pos)
    }

    fun getDefiniitionPrefence(): Int {
        return SharedPreferencesUtil.instance.getInt(DEFINIITION_PREFENCE_KEY, 0)
    }

    fun selectDefiniitionRate(rate: Int) {
        SharedPreferencesUtil.instance.setInt(DEFINIITION_RATE_PREFENCE_KEY, rate)
    }

    fun getDefiniitionRate(): Int {
        return SharedPreferencesUtil.instance.getInt(DEFINIITION_RATE_PREFENCE_KEY, 50)
    }

}