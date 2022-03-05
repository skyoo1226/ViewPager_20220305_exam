package com.skyoo.viewpager_20220305_exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.skyoo.viewpager_20220305_exam.fragments.HelloFragment
import com.skyoo.viewpager_20220305_exam.fragments.MyInfoFragment
import com.skyoo.viewpager_20220305_exam.fragments.MynameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position) {
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }

    }

    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> MynameFragment()
            1 -> MyInfoFragment()
            else -> HelloFragment()
        }

    }
}