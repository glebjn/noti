package com.study.core_utils.routing.activity

import android.app.Activity
import android.app.Application
import android.os.Bundle
import javax.inject.Inject

class ActivityLifecycleCallbackHandler @Inject constructor(
    private val activityHolder: ActivityHolder
) : Application.ActivityLifecycleCallbacks {

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}

    override fun onActivityStarted(activity: Activity) {
        activityHolder.attach(activity)
    }

    override fun onActivityResumed(activity: Activity) {}

    override fun onActivityPaused(activity: Activity) {}

    override fun onActivityStopped(activity: Activity) {
        activityHolder.detach(activity)
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}

    override fun onActivityDestroyed(activity: Activity) {}
}