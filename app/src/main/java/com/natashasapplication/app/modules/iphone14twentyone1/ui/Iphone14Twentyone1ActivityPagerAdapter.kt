package com.natashasapplication.app.modules.iphone14twentyone1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.natashasapplication.app.R
import com.natashasapplication.app.appcomponents.di.MyApp
import com.natashasapplication.app.modules.iphone14twenty.ui.Iphone14TwentyFragment
import com.natashasapplication.app.modules.iphone14twentyone.ui.Iphone14TwentyoneFragment
import com.natashasapplication.app.modules.iphone14twentysix.ui.Iphone14TwentysixFragment
import com.natashasapplication.app.modules.iphone14twentytwo.ui.Iphone14TwentytwoFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class Iphone14Twentyone1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_burgers2),MyApp.getInstance().resources.getString(R.string.lbl_beverages),MyApp.getInstance().resources.getString(R.string.lbl_desserts),MyApp.getInstance().resources.getString(R.string.lbl_hot_deals))

        val viewPages: List<Fragment> =
                listOf(Iphone14TwentysixFragment(),Iphone14TwentyFragment(),Iphone14TwentyoneFragment(),Iphone14TwentytwoFragment())

    }
}
