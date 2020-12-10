package com.study.core_utils.routing.resources

import androidx.annotation.StringRes

interface ResourcesUtils {

    fun getString(@StringRes resId: Int): String
}