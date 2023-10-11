package com.feng1.iot.hardware_haha

import com.feng1.iot.common.IHardware
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class HardwareHahaModule {

    @Singleton
    @Provides
    fun provideHardwareHaha(): IHardware = HardwareHahaImpl()
}