package com.example.oxapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.oxapp.databinding.ActivityMnemonicSignIn1Binding

class MnemonicSignInActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMnemonicSignIn1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mnemonic_sign_in1)

        binding.createPass.setOnClickListener {
            val intent = Intent(this, MnemonicSignInActivity2::class.java)
            startActivity(intent)
        }
    }
}