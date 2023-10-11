package com.feng1.iot.common

import android.content.Context

interface IHardware {

    /**
     * 初始化
     */
    fun init()

    /**
     * 初始化摄像头数
     *
     * @param camera_main_num 主摄像头数量 主摄像头最少默认为1
     * @param camera_secondary_num 辅摄像头数量
     */
    fun initCameraCount(camera_main_num: Int, camera_secondary_num: Int)

    /**
     * 获取主板号
     */
    fun getDevId(): String

    /**
     * 日志开关
     *
     * @param mDebuggable true 打开 false 关闭
     */
    fun setLogState(mDebuggable: Boolean)

    /**
     * 保存日志文件中 优先级高于 上面的日志开关
     *
     * @param isSaveLogcat true 开启 false 关闭
     * @param mPath 保存的绝对文件路径
     * @param fileName 保存的文件名
     */
    fun saveLogcat(isSaveLogcat: Boolean, mPath: String, fileName: String)

    /**
     * 日志保存天数 默认最小10天 设置不能低于10天 低于10天无效
     *
     * @param maxDays 日志保存天数
     */
    fun saveLogcatMaxDays(maxDays: Int)

    /**
     * 开锁
     *
     * @param index 锁id 1：锁1 2 ：锁2
     */
    fun sendOpenLock(index: Int)

    /**
     * 关锁
     * @param index 锁id 1：锁1 2 ：锁2
     */
    fun sendCloseLock(index: Int)

    /**
     * 开双锁
     */
    fun sendOpenLockAll()

    /**
     * 关双锁
     */
    fun businessCloseLockAll()

    /**
     * 检查锁状态
     *
     * @param index 1：锁1 2 ：锁2
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 检查的超时时间 最小超时时间 1s
     * @return true: 开关锁成功, false: check timeout
     */
    fun whileCheckLockState(index: Int, checkState: Int, timeout_s: Int): Boolean

    /**
     * 检查门状态
     *
     * @param index 1：锁1 2 ：锁2
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 需要检查的时间 单位秒 最小超时时间 1s
     * @return true:门开关状态 false: check timeout
     */
    fun whileCheckDoorState(index: Int, checkState: Int, timeout_s: Int): Boolean

    /**
     * 检查双门状态
     *
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 需要检查的时间 单位秒 最小超时时间 1s
     * @return true:门开关状态 false: check timeout
     */
    fun whileCheckDoorStateAll(checkState: Int, timeout_s: Int): Boolean

    /**
     * 检查双锁状态
     *
     * @param checkState DState.OPEN/DState.CLOSE
     * @param timeout_s 检查的超时时间 最小超时时间 1s
     * @return true: 开关锁成功, false: check timeout
     */
    fun whileCheckLockStateAll(checkState: Int, timeout_s: Int): Boolean

    /**
     * 获取摄像头总数量 此数量是以初始化数量为基础的
     */
    fun getCameraSize(): Int

    /**
     * 开启摄像头录制
     *
     * @param index 指定摄像头停止录制索引 例如 0 主 1 辅
     * @param filePathName 录制文件的绝对路径
     */
    fun startRecord(index: Int, filePathName: String): Boolean

    /**
     * 停止录制
     * @param index 指定摄像头停止录制索引 例如 0 主 1 辅
     */
    fun stopRecord(index: Int)

    /**
     * 全部停止录制
     */
    fun doStopRecordAll()

    /**
     * 同步抓拍
     *
     * @param index 指定摄像头抓拍索引 例如 0 主 1 辅
     * @param filePathName
     * @return 返回为空 就表示抓拍失败
     */
    fun syncCapture(index: Int, filePathName: String): String

    /**
     * h264 转换 MP4
     *
     * @param h264Path h264输入文件绝对路径
     * @param mp4Path mp4输出文件绝对路径
     * @return true 转换成功 false 转换失败
     */
    fun h264ToMp4(h264Path: String, mp4Path: String): Boolean

    /**
     * 重启摄像头
     */
    fun restartCam()

    /**
     * 设置心跳包频率 默认每分钟
     * 如果需要 app起来后调用一次
     */
    fun ctlHeartCount()

    /**
     * 发送mcu心跳包 每分钟发一次
     * 上面的ctlHeartCount() 调用了 这个需要每分钟发一次
     */
    fun sendHeart()

    /**
     * 重启设备
     */
    fun resetBoard(context: Context)

    /**
     * 重启4G网络模块（耗时较长）
     */
    fun restartWirelessCard()

    /**
     * 复位以太网和交换机
     */
    fun resetHub()

    /**
     * 设置LED灯带亮度
     *
     * @param type 0 柜体灯带亮度 1 灯箱罩亮度
     * @param value 设置灯带值 0-99之间
     */
    fun setLedBrightnessValue(type: Int, value: Int): Boolean

    /**
     * 设置本地音量
     *
     * @param volSize 设置音量值 0-15之间
     */
    fun setMusicVolSize(context: Context, volSize: String): Boolean

    /**
     * 查询mcu版本
     *
     * @return 0表示查询失败
     */
    fun getMcuVersion(): String

    /**
     * 查询固件版本
     */
    fun getFirmwareVersion(): String

    /**
     * 查询是否被断电 断电了可以不然开门
     *
     * @return true 断电（ups工作） false 没有断电（ups没有工作）
     */
    fun checkDCState(): Boolean

    /**
     * 释放资源
     */
    fun onDestroy()
}