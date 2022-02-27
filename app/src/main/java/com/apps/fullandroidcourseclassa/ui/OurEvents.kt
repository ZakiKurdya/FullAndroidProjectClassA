package com.apps.fullandroidcourseclassa.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.apps.fullandroidcourseclassa.R
import com.apps.fullandroidcourseclassa.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_our_events.view.*

class OurEvents : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.activity_our_events, container, false)
        val viewpagger = view.findViewById<ViewPager2>(R.id.viewPagerOfEvents)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayoutOfEvents)
        val images = listOf(
            R.drawable.speakerone,
            R.drawable.speakertwo,
            R.drawable.speakerthree,
            R.drawable.speakerfour,
            R.drawable.speakerfive,
            R.drawable.speakersix,
            R.drawable.eventone,
            R.drawable.eventtwo,
        )
        val myAdapter = ViewPagerAdapter(images)
        view.viewPagerOfEvents.adapter = myAdapter
        TabLayoutMediator(tabLayout, viewpagger) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
        view.tabLayoutOfEvents.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(activity, "Selected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(activity, "UnSelected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(activity, "ReSelected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

        })
        return view
//
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}


//        viewPagerOfEvents.orientation = ViewPager2.ORIENTATION_VERTICAL
//        viewPagerOfEvents.beginFakeDrag()
//        viewPagerOfEvents.fakeDragBy(-10f)
//        viewPagerOfEvents.endFakeDrag()