package com.zhihu.matisse

import android.content.Context
import android.content.pm.PackageManager

/**
 * Created by wangchenyan.top on 2023/8/4.
 */
object AppUtils {

    fun getAppTargetSdkVersion(context: Context): Int {
        return try {
            val pm: PackageManager = context.packageManager
            val pi = pm.getPackageInfo(context.packageName, 0) ?: return -1
            val ai = pi.applicationInfo
            ai?.targetSdkVersion ?: -1
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            -1
        }
    }
}