package com.study.noti

import androidx.fragment.app.FragmentActivity
import com.study.core_utils.routing.activity.ActivityHolder
import com.study.core_utils.routing.fragment.start
import com.study.core_utils.routing.navigation.Router
import com.study.noties.NotiesFragment
import javax.inject.Inject

class FragmentRouter @Inject constructor(
    private val activityHolder: ActivityHolder
) : Router {

    override fun startNoties() {
        val fragment = NotiesFragment()
        (activityHolder.findAvailableContext() as FragmentActivity)
            .supportFragmentManager
            .start(
                fragment = fragment,
                containerId = R.id.fragments_container
            )
    }
}