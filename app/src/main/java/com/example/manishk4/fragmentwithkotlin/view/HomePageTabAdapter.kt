package com.example.manishk4.fragmentwithkotlin.view

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class HomePageTabAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    private val fragmentList: ArrayList<Fragment> = ArrayList()
    private val titleList: ArrayList<String> = ArrayList()


    fun addTab(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}