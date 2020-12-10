package com.study.noties

import com.study.core_utils.routing.fragment.BaseFragment
import com.study.noties.databinding.NotiesFragmentBinding

class NotiesFragment : BaseFragment() {

    private lateinit var binding: NotiesFragmentBinding

    override fun bindLayout() = R.layout.noties_fragment
}