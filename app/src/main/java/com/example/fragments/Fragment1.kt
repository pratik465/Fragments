package com.example.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Fragment1(fm: FragmentManager, fragments: Array<Fragment>, item: Array<String>) : FragmentPagerAdapter(fm) {

    var fragment = fragments
    var item = item

    override fun getCount(): Int {

        return fragment.size
    }

    override fun getItem(position: Int): Fragment {
        return fragment.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return item.get(position)
    }
}