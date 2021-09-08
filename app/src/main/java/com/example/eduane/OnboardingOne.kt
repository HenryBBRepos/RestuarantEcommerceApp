package com.example.eduane

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import kotlinx.android.synthetic.main.onboarding_one.*


class OnboardingOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_one)

        supportActionBar?.hide()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val onboarding_one = findViewById<Button>(R.id.onboarding_one)
        onboarding_one.setOnClickListener {
            val intent = Intent(this@OnboardingOne, OnboardingTwo::class.java)
            startActivity(intent)

        }
    }
}