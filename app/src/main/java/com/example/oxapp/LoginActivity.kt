package com.example.oxapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.oxapp.adapter.SliderAdapter
import com.example.oxapp.databinding.ActivityLoginBinding
import com.example.oxapp.model.SliderData

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    private lateinit var slideshowAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        val window: Window = this@LoginActivity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@LoginActivity, R.color.blue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        /*getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)*/
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/
        getWindow().decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*/*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/*/

        binding.createaccount.setOnClickListener {
            val intent = Intent(this, CreatePassword::class.java)
            startActivity(intent)
        }

        binding.signinbtn.setOnClickListener {
            val intent = Intent(this, CreatePassword::class.java)
            startActivity(intent)
        }

        settingSlider()
    }

    private fun settingSlider() {
        slideshowAdapter = SliderAdapter()
        slideshowAdapter.mSliderItems = arrayListOf(
            SliderData(
                "Abcd",
                R.drawable.blockchain,
                "Defadfkjajsfask askjdjkasjkdsa mkjsakjsad"
            ),
            SliderData(
                "Abcd",
                R.drawable.bluetooth,
                "Defadfkjajsfask askjdjkasjkdsa mkjsakjsad"
            ),
        )
        binding.slider.apply {
            isAutoCycle = false
            setSliderAdapter(slideshowAdapter, false)
        }
        /*bi.slider.setCurrentPageListener {
            when (it) {
                0 -> {
                    bi.apply {
                        tvBackIntro.visibility = View.GONE
                        tvSkipIntro.visibility = View.GONE
                    }
                }
                else -> {
                    if (it < slideshowAdapter.mSliderItems.size - 1)
                        bi.tvSkipIntro.visibility = View.VISIBLE
                    else bi.tvSkipIntro.visibility = View.GONE
                    bi.tvBackIntro.visibility = View.VISIBLE

                }
            }
        }*/
    }

}