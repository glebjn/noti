package com.study.core_utils.routing.fragment

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.start(
    fragment: Fragment,
    @IdRes containerId: Int
) {
    beginTransaction().replace(containerId, fragment).commit()
}