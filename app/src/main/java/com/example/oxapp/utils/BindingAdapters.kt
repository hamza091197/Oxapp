package com.example.oxapp.utils

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BaseObservable
import androidx.databinding.BindingAdapter
import coil.load

object BindingAdapters : BaseObservable() {

    @BindingAdapter("loadImage")
    @JvmStatic
    fun loadImage(imageView: AppCompatImageView, url: Int?) {
        url?.let{
            imageView.load(it) {
                crossfade(true)
            }
        }
    }
}