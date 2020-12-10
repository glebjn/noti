package com.study.core_utils.routing.resources

import android.content.Context
import javax.inject.Inject

class ResourcesUtilsImpl @Inject constructor(
    private val context: Context
) : ResourcesUtils {

    override fun getString(resId: Int) = context.getString(resId)
}