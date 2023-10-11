package com.feng1.iot.common

import kotlinx.coroutines.delay

object ContainerHelper {

    /**
     * 开锁操作
     * @return 是否已开锁
     */
    suspend fun openLock(): Boolean {
        ContainerSDK.sendOpenLock(1)
        delay(100)
        val whileCheckLockState: Boolean = ContainerSDK.whileCheckLockState(
            1, 1, 1
        )
        return whileCheckLockState
    }

    /**
     * 关锁操作
     * @return 是否已关锁
     */
    suspend fun closeLock(): Boolean {
        ContainerSDK.sendCloseLock(1)
        delay(100)
        val whileCheckLockState = ContainerSDK.whileCheckLockState(
            1, 1, 1
        )
        return whileCheckLockState
    }


}