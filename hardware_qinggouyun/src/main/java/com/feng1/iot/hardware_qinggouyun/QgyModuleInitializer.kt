package com.feng1.iot.hardware_qinggouyun

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

/**
 * 应用启动时自动调用
 */
class QgyModuleInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        // TODO 做一些初始化的工作
        Log.d("Initializer", "轻购云Module初始化")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}