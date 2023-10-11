package com.feng1.iot.common

import android.content.Context

object ContainerSDK : IHardware{
    private var sdkHelper : IHardware? = null

    fun initSDK(iHardware: IHardware) {
        sdkHelper = iHardware
    }

    override fun init() {
        sdkHelper?.init()
    }

    override fun initCameraCount(camera_main_num: Int, camera_secondary_num: Int) {
        sdkHelper?.initCameraCount(camera_main_num, camera_secondary_num)
    }

    override fun getDevId(): String {
        return sdkHelper?.getDevId()!!
    }

    override fun setLogState(mDebuggable: Boolean) {
        sdkHelper?.setLogState(mDebuggable)
    }

    override fun saveLogcat(isSaveLogcat: Boolean, mPath: String, fileName: String) {
        sdkHelper?.saveLogcat(isSaveLogcat, mPath, fileName)
    }

    override fun saveLogcatMaxDays(maxDays: Int) {
        sdkHelper?.saveLogcatMaxDays(maxDays)
    }

    override fun sendOpenLock(index: Int) {
        sdkHelper?.sendOpenLock(index)
    }

    override fun sendCloseLock(index: Int) {
        sdkHelper?.sendCloseLock(index)
    }

    override fun sendOpenLockAll() {
        sdkHelper?.sendOpenLockAll()
    }

    override fun businessCloseLockAll() {
        sdkHelper?.businessCloseLockAll()
    }

    override fun whileCheckLockState(index: Int, checkState: Int, timeout_s: Int): Boolean {
        return sdkHelper?.whileCheckLockState(index, checkState, timeout_s)!!
    }

    override fun whileCheckDoorState(index: Int, checkState: Int, timeout_s: Int): Boolean {
        return sdkHelper?.whileCheckDoorState(index, checkState, timeout_s)!!
    }

    override fun whileCheckDoorStateAll(checkState: Int, timeout_s: Int): Boolean {
        return sdkHelper?.whileCheckDoorStateAll(checkState, timeout_s)!!
    }

    override fun whileCheckLockStateAll(checkState: Int, timeout_s: Int): Boolean {
        return sdkHelper?.whileCheckLockStateAll(checkState, timeout_s)!!
    }

    override fun getCameraSize(): Int {
        return sdkHelper?.getCameraSize()!!
    }

    override fun startRecord(index: Int, filePathName: String): Boolean {
        return sdkHelper?.startRecord(index, filePathName)!!
    }

    override fun stopRecord(index: Int) {
        sdkHelper?.stopRecord(index)
    }

    override fun doStopRecordAll() {
        sdkHelper?.doStopRecordAll()
    }

    override fun syncCapture(index: Int, filePathName: String): String {
        return sdkHelper?.syncCapture(index, filePathName)!!
    }

    override fun h264ToMp4(h264Path: String, mp4Path: String): Boolean {
        return sdkHelper?.h264ToMp4(h264Path, mp4Path)!!
    }

    override fun restartCam() {
        sdkHelper?.restartCam()
    }

    override fun ctlHeartCount() {
        sdkHelper?.ctlHeartCount()
    }

    override fun sendHeart() {
        sdkHelper?.sendHeart()
    }

    override fun resetBoard(context: Context) {
        sdkHelper?.resetBoard(context)
    }

    override fun restartWirelessCard() {
        sdkHelper?.restartWirelessCard()
    }

    override fun resetHub() {
        sdkHelper?.resetHub()
    }

    override fun setLedBrightnessValue(type: Int, value: Int): Boolean {
        return sdkHelper?.setLedBrightnessValue(type, value)!!
    }

    override fun setMusicVolSize(context: Context, volSize: String): Boolean {
        return sdkHelper?.setMusicVolSize(context, volSize)!!
    }

    override fun getMcuVersion(): String {
        return sdkHelper?.getMcuVersion()!!
    }

    override fun getFirmwareVersion(): String {
        return sdkHelper?.getFirmwareVersion()!!
    }

    override fun checkDCState(): Boolean {
        return sdkHelper?.checkDCState()!!
    }

    override fun onDestroy() {
        sdkHelper?.onDestroy()
    }
}