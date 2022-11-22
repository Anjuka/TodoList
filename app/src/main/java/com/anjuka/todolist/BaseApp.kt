package com.anjuka.todolist

import android.app.Application
import com.google.android.material.color.DynamicColors
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}