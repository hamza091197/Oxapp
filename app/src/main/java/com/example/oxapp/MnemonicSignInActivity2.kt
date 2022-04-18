package com.example.oxapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.oxapp.databinding.ActivityMnemonicSignIn1Binding
import com.example.oxapp.databinding.ActivityMnemonicSignIn2Binding

class MnemonicSignInActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMnemonicSignIn2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mnemonic_sign_in2)


        val window: Window = this@MnemonicSignInActivity2.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@MnemonicSignInActivity2, R.color.white)
        window.navigationBarColor = resources.getColor(R.color.gray)
        /*getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)*/
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/
        getWindow().decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*/*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/*/


        binding.createPass.setOnClickListener {
            val intent = Intent(this, MnemonicSignInActivity3::class.java)
            startActivity(intent)
        }
    }
}