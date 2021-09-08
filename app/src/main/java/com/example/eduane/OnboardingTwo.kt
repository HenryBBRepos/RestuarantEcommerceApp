package com.example.eduane

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import kotlinx.android.synthetic.main.onboarding_one.*

class OnboardingTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_two)

        supportActionBar?.hide()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val onboarding_two = findViewById<Button>(R.id.onboarding_two)
        onboarding_two.setOnClickListener {
            val intent = Intent(this@OnboardingTwo, OnboardingThree::class.java)
            startActivity(intent)

        }

    }
}
