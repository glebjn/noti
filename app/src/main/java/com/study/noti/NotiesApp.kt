package com.study.noti

import android.app.Application
import com.study.core_utils.routing.activity.ActivityLifecycleCallbackHandler
import com.study.noti.di.AppModule
import com.study.noti.di.DaggerAppComponent
import javax.inject.Inject

class NotiesApp : Application() {

    @Inject
    lateinit var activityLifecycleCallbackHandler: ActivityLifecycleCallbackHandler

    override fun onCreate() {
        super.onCreate()
        injectRootComponent()
        registerActivityCallbacks()
    }

    private fun injectRootComponent() {
        DaggerAppComponent.factory().create(
            context = this.applicationContext,
            appModule = AppModule()
        ).inject(this)
    }

    private fun registerActivityCallbacks() {
        registerActivityLifecycleCallbacks(activityLifecycleCallbackHandler)
    }
}