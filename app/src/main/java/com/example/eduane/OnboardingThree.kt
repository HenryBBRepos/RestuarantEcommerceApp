package com.example.eduane

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import kotlinx.android.synthetic.main.onboarding_one.*
import kotlinx.android.synthetic.main.onboarding_three.*

class OnboardingThree : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_three)

        supportActionBar?.hide()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val onboarding_three = findViewById<Button>(R.id.onboarding_three)
        onboarding_three.setOnClickListener {
            val intent = Intent(this@OnboardingThree, Home::class.java)
            startActivity(intent)

        }
    }
}
