package com.example.manishk4.fragmentwithkotlin.view


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.manishk4.fragmentwithkotlin.R
import com.example.manishk4.fragmentwithkotlin.viewmodel.ShareDataViewModel


class CallFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_call, container, false)
        val model = ViewModelProviders.of(activity!!).get(ShareDataViewModel::class.java!!)
        model.message.observe(this, Observer { str ->
            Log.d("TEST", "Data in Call Fragment : $str")
        })
        return view
    }


}
