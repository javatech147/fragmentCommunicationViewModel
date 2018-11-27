package com.example.manishk4.fragmentwithkotlin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.manishk4.fragmentwithkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val homePageAdapter = HomePageTabAdapter(supportFragmentManager)
        homePageAdapter.addTab(ContactFragment(), "Contact")
        homePageAdapter.addTab(CallFragment(), "Call")

        viewPager.adapter = homePageAdapter

        tabLayout.setupWithViewPager(viewPager)
    }
}
