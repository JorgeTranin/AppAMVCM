package com.visitantes.appamvcm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.visitantes.appamvcm.R
import com.visitantes.appamvcm.adapter.ViewPagerAdapter
import com.visitantes.appamvcm.fragment.FeedFragment
import com.visitantes.appamvcm.fragment.TrashFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTabs()
    }

    private fun setTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FeedFragment(), "Visitantes")
        adapter.addFragment(TrashFragment(), "Apagados")

        viewPager.adapter = adapter

        // give tab settings with viewpager;
        tabs.setupWithViewPager(viewPager)
        // give tab icon with setIcon by its index;
        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_dynamic_feed_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_delete_24)
    }
}