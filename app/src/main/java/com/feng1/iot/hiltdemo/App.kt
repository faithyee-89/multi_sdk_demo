package com.feng1.iot.hiltdemo

import android.app.Application
import com.feng1.iot.common.ContainerSDK
import com.feng1.iot.common.IHardware
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {

    @Inject
    lateinit var hardware: IHardware

    override fun onCreate() {
        super.onCreate()
        ContainerSDK.initSDK(hardware)
    }
}