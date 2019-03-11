package com.example.HaveIBeenPawnedKotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun String.addSuffix() {
    this + "is Really Cool"
}fun ViewGroup.inflate(layoutRes: Int): View{
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}