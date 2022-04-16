package com.example.oxapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.oxapp.databinding.ActivityCreatePasswordBinding

class CreatePassword : AppCompatActivity() {
    lateinit var binding: ActivityCreatePasswordBinding
    private var mIsShowPass = false
    private var mIsShowPass2 = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_create_password)


        val window: Window = this@CreatePassword.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@CreatePassword, R.color.blue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        /*getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)*/
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*/*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/*/

        /*binding.createPass.setOnClickListener {

            if(binding.etpass.text.trim().toString().isEmpty()){
                binding.etpass.requestFocus()
                binding.etpass.error = "Enter Password"
                return@setOnClickListener
            }

            if(binding.etpasscon.text.trim().toString().isEmpty()){
                binding.etpasscon.requestFocus()
                binding.etpasscon.error = "Enter Password"
                return@setOnClickListener
            }

            val intent = Intent(this, CongratulationActivity::class.java)
            startActivity(intent)
        }

        binding.imgbuttonBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.ivshowhisdepassword.setOnClickListener {
            mIsShowPass = !mIsShowPass
            showPassword(mIsShowPass)
        }

        binding.ivshowhisdepassword2.setOnClickListener {
            mIsShowPass2 = !mIsShowPass2
            showPassword(mIsShowPass2)
        }*/

        binding.createPass.setOnClickListener {
            val intent = Intent(this, CongratulationActivity::class.java)
            startActivity(intent)
        }


    }



    private fun showPassword(isShow: Boolean){
        if (isShow){
            binding.etpass.transformationMethod = HideReturnsTransformationMethod.getInstance()
            binding.ivshowhisdepassword.setImageResource(R.drawable.ic_hide_password_24dp)
        }
        else{
            binding.etpass.transformationMethod = PasswordTransformationMethod.getInstance()
            binding.ivshowhisdepassword.setImageResource(R.drawable.ic_show_password_24dp)
        }
        binding.etpass.setSelection(binding.etpass.text.toString().length)


        if (isShow){
            binding.etpasscon.transformationMethod = HideReturnsTransformationMethod.getInstance()
            binding.ivshowhisdepassword2.setImageResource(R.drawable.ic_hide_password_24dp)
        }
        else{
            binding.etpasscon.transformationMethod = PasswordTransformationMethod.getInstance()
            binding.ivshowhisdepassword2.setImageResource(R.drawable.ic_show_password_24dp)
        }
        binding.etpasscon.setSelection(binding.etpasscon.text.toString().length)
    }
}