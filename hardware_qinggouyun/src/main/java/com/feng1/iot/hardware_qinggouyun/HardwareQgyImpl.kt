package com.feng1.iot.hardware_qinggouyun

import android.content.Context
import android.util.Log
import com.feng1.iot.common.IHardware

class HardwareQgyImpl : IHardware {
    companion object {
        private const val TAG = "HardwareQgyImpl"
    }

    /**
     * 初始化
     */
    override fun init() {
        Log.d("HardwareQgyImpl", "轻购云SDK初始化")
    }

    /**
     * 初始化摄像头数
     *
     * @param camera_main_num 主摄像头数量 主摄像头最少默认为1
     * @param camera_secondary_num 辅摄像头数量
     */
    override fun initCameraCount(camera_main_num: Int, camera_secondary_num: Int) {
        TODO("Not yet implemented")
    }

    /**
     * 获取主板号
     */
    override fun getDevId(): String {
        TODO("Not yet implemented")
    }

    /**
     * 日志开关
     *
     * @param mDebuggable true 打开 false 关闭
     */
    override fun setLogState(mDebuggable: Boolean) {
        TODO("Not yet implemented")
    }

    /**
     * 保存日志文件中 优先级高于 上面的日志开关
     *
     * @param isSaveLogcat true 开启 false 关闭
     * @param mPath 保存的绝对文件路径
     * @param fileName 保存的文件名
     */
    override fun saveLogcat(isSaveLogcat: Boolean, mPath: String, fileName: String) {
        TODO("Not yet implemented")
    }

    /**
     * 日志保存天数 默认最小10天 设置不能低于10天 低于10天无效
     *
     * @param maxDays 日志保存天数
     */
    override fun saveLogcatMaxDays(maxDays: Int) {
        TODO("Not yet implemented")
    }

    /**
     * 开锁
     *
     * @param index 锁id 1：锁1 2 ：锁2
     */
    override fun sendOpenLock(index: Int) {
        Log.d(TAG, "qgy sendOpenLock: ")
    }

    /**
     * 关锁
     * @param index 锁id 1：锁1 2 ：锁2
     */
    override fun sendCloseLock(index: Int) {
        Log.d(TAG, "qgy sendCloseLock: ")
    }

    /**
     * 开双锁
     */
    override fun sendOpenLockAll() {
        TODO("Not yet implemented")
    }

    /**
     * 关双锁
     */
    override fun businessCloseLockAll() {
        TODO("Not yet implemented")
    }

    /**
     * 检查锁状态
     *
     * @param index 1：锁1 2 ：锁2
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 检查的超时时间 最小超时时间 1s
     * @return true: 开关锁成功, false: check timeout
     */
    override fun whileCheckLockState(index: Int, checkState: Int, timeout_s: Int): Boolean {
        Log.d(TAG, "qgy -> whileCheckLockState: ")
        return true
    }

    /**
     * 检查门状态
     *
     * @param index 1：锁1 2 ：锁2
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 需要检查的时间 单位秒 最小超时时间 1s
     * @return true:门开关状态 false: check timeout
     */
    override fun whileCheckDoorState(index: Int, checkState: Int, timeout_s: Int): Boolean {
        Log.d(TAG, "qgy -> whileCheckDoorState: ")
        return true
    }

    /**
     * 检查双门状态
     *
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 需要检查的时间 单位秒 最小超时时间 1s
     * @return true:门开关状态 false: check timeout
     */
    override fun whileCheckDoorStateAll(checkState: Int, timeout_s: Int): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * 检查双锁状态
     *
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 检查的超时时间 最小超时时间 1s
     * @return true: 开关锁成功, false: check timeout
     */
    override fun whileCheckLockStateAll(checkState: Int, timeout_s: Int): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * 获取摄像头总数量 此数量是以初始化数量为基础的
     */
    override fun getCameraSize(): Int {
        TODO("Not yet implemented")
    }

    /**
     * 开启摄像头录制
     *
     * @param index 指定摄像头停止录制索引 例如 0 主 1 辅
     * @param filePathName 录制文件的绝对路径
     */
    override fun startRecord(index: Int, filePathName: String): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * 停止录制
     * @param index 指定摄像头停止录制索引 例如 0 主 1 辅
     */
    override fun stopRecord(index: Int) {
        TODO("Not yet implemented")
    }

    /**
     * 全部停止录制
     */
    override fun doStopRecordAll() {
        TODO("Not yet implemented")
    }

    /**
     * 同步抓拍
     *
     * @param index 指定摄像头抓拍索引 例如 0 主 1 辅
     * @param filePathName
     * @return 返回为空 就表示抓拍失败
     */
    override fun syncCapture(index: Int, filePathName: String): String {
        TODO("Not yet implemented")
    }

    /**
     * h264 转换 MP4
     *
     * @param h264Path h264输入文件绝对路径
     * @param mp4Path mp4输出文件绝对路径
     * @return true 转换成功 false 转换失败
     */
    override fun h264ToMp4(h264Path: String, mp4Path: String): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * 重启摄像头
     */
    override fun restartCam() {
        TODO("Not yet implemented")
    }

    /**
     * 设置心跳包频率 默认每分钟
     * 如果需要 app起来后调用一次
     */
    override fun ctlHeartCount() {
        TODO("Not yet implemented")
    }

    /**
     * 发送mcu心跳包 每分钟发一次
     * 上面的ctlHeartCount() 调用了 这个需要每分钟发一次
     */
    override fun sendHeart() {
        TODO("Not yet implemented")
    }

    /**
     * 重启设备
     */
    override fun resetBoard(context: Context) {
        TODO("Not yet implemented")
    }

    /**
     * 重启4G网络模块（耗时较长）
     */
    override fun restartWirelessCard() {
        TODO("Not yet implemented")
    }

    /**
     * 复位以太网和交换机
     */
    override fun resetHub() {
        TODO("Not yet implemented")
    }

    /**
     * 设置LED灯带亮度
     *
     * @param type 0 柜体灯带亮度 1 灯箱罩亮度
     * @param value 设置灯带值 0-99之间
     */
    override fun setLedBrightnessValue(type: Int, value: Int): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * 设置本地音量
     *
     * @param volSize 设置音量值 0-15之间
     */
    override fun setMusicVolSize(context: Context, volSize: String): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * 查询mcu版本
     *
     * @return 0表示查询失败
     */
    override fun getMcuVersion(): String {
        TODO("Not yet implemented")
    }

    /**
     * 查询固件版本
     */
    override fun getFirmwareVersion(): String {
        TODO("Not yet implemented")
    }

    /**
     * 查询是否被断电 断电了可以不然开门
     *
     * @return true 断电（ups工作） false 没有断电（ups没有工作）
     */
    override fun checkDCState(): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * 释放资源
     */
    override fun onDestroy() {
        TODO("Not yet implemented")
    }
}