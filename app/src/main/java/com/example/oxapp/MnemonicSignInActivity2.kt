package com.example.oxapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.oxapp.databinding.ActivityMnemonicSignIn1Binding
import com.example.oxapp.databinding.ActivityMnemonicSignIn2Binding

class MnemonicSignInActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMnemonicSignIn2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mnemonic_sign_in2)

        binding.createPass.setOnClickListener {
            val intent = Intent(this, MnemonicSignInActivity3::class.java)
            startActivity(intent)
        }
    }
}