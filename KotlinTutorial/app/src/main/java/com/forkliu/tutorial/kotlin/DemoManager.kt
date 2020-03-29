package com.forkliu.tutorial.kotlin

import android.util.Log

object DemoManager {
    private val TAG = "DemoManager"
    private var name:String? = null

    fun a() {
        Log.e(TAG, "此时 object 表示 声明静态内部类")
    }

    fun setTestName(x:String){
        name = x
    }

}