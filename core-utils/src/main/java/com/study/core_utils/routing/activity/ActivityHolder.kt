package com.study.core_utils.routing.activity

import android.app.Activity

interface ActivityHolder {

    fun attach(activity: Activity)

    fun findAvailableContext(): Activity?

    fun detach(activity: Activity)
}