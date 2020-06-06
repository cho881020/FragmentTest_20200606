package kr.co.tjoeun.fragmenttest_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragmenttest_20200606.fragments.MyProfileFragment
import kr.co.tjoeun.fragmenttest_20200606.fragments.StudentListFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return MyProfileFragment()
        }
        else {
            return StudentListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}