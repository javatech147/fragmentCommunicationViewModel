package com.example.manishk4.fragmentwithkotlin.view

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.manishk4.fragmentwithkotlin.R
import com.example.manishk4.fragmentwithkotlin.viewmodel.ShareDataViewModel
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_contact.view.*


class ContactFragment : Fragment() {

    private lateinit var model: ShareDataViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        model = ViewModelProviders.of(activity!!).get(ShareDataViewModel::class.java!!)

        view.buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString().trim()
            model.setMessage(name)
        }
        return view
    }
}
