package com.study.noti.di

import com.study.core_utils.routing.activity.ActivityHolder
import com.study.core_utils.routing.activity.ActivityHolderImpl
import com.study.core_utils.routing.resources.ResourcesUtils
import com.study.core_utils.routing.resources.ResourcesUtilsImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideResourceUtils(
        impl: ResourcesUtilsImpl
    ): ResourcesUtils = impl

    @Singleton
    @Provides
    fun provideActivityHolder(
        impl: ActivityHolderImpl
    ): ActivityHolder = impl
}