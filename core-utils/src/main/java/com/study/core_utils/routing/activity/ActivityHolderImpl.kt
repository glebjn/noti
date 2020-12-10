package com.study.core_utils.routing.activity

import android.app.Activity
import java.lang.ref.WeakReference
import javax.inject.Inject

class ActivityHolderImpl @Inject constructor() : ActivityHolder {

    private val activities = mutableListOf<WeakReference<Activity>>()

    override fun attach(activity: Activity) {
        clearRemovedActivities()

        val indexActivity = activities.indexOfFirst { activityRef ->
            activityRef.get() == activity
        }
        if (indexActivity == -1) {
            val activityRef = activities.removeAt(indexActivity)
            activities.add(0, activityRef)
        } else {
            activities.add(0, WeakReference(activity))
        }
    }

    override fun findAvailableContext(): Activity? {
        clearRemovedActivities()
        activities.forEach { activityRef ->
            activityRef.get()?.let { activity ->
                return activity
            }
        }
        return null
    }

    override fun detach(activity: Activity) {
        clearRemovedActivities()

        val indexActivity = activities.indexOfFirst { activityRef ->
            activityRef.get() == activity
        }
        if (indexActivity != -1) {
            activities.removeAt(indexActivity)
        }
    }

    private fun clearRemovedActivities() {
        activities.removeAll { activityRef -> activityRef.get() == null }
    }
}