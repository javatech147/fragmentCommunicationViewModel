package com.example.manishk4.fragmentwithkotlin.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ShareDataViewModel : ViewModel() {
    val message = MutableLiveData<String>()

    fun setMessage(msg: String) {
        message.setValue(msg)
    }
}