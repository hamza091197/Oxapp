package com.example.oxapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.oxapp.R
import com.example.oxapp.databinding.LayoutSliderBinding
import com.example.oxapp.model.SliderData
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlin.collections.ArrayList
import androidx.databinding.library.baseAdapters.BR

class SliderAdapter : SliderViewAdapter<SliderAdapterViewHolder>() {

    var mSliderItems: ArrayList<SliderData> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup): SliderAdapterViewHolder {
        return SliderAdapterViewHolder.create(viewGroup)
    }

    //Inside on bind view holder we will set data to item of Slider View.
    override fun onBindViewHolder(holder: SliderAdapterViewHolder, i: Int) {
        val item = mSliderItems[i]
        holder.bind(item)
    }

    //this method will return the count of our list.
    override fun getCount(): Int {
        return mSliderItems.size
    }
}

class SliderAdapterViewHolder(private val bi: LayoutSliderBinding) :
    SliderViewAdapter.ViewHolder(bi.root) {
    fun bind(item: SliderData) {
        bi.apply {
            bi.setVariable(BR.item, item)
            bi.executePendingBindings()
        }
    }


    companion object {
        fun create(viewGroup: ViewGroup): SliderAdapterViewHolder {
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.layout_slider, viewGroup, false)
            val binding = LayoutSliderBinding.bind(view)
            return SliderAdapterViewHolder(binding)
        }
    }
}