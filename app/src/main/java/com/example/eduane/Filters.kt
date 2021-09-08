package com.example.eduane

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Spinner

class Filters : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filters)

        supportActionBar?.hide()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val category_one = findViewById(R.id.category_one) as Spinner
        val category_two = findViewById(R.id.category_two) as Spinner
        val category_three = findViewById(R.id.category_three) as Spinner
        val category_four = findViewById(R.id.category_four) as Spinner


        // Create an ArrayAdapter using the string array and a default spinner
        val staticAdapterOne = ArrayAdapter
            .createFromResource(
                this, R.array.category_one,
                android.R.layout.simple_spinner_item
            )

        val staticAdapterTwo = ArrayAdapter
            .createFromResource(
                this, R.array.category_two,
                android.R.layout.simple_spinner_item
            )

        val staticAdapterThree = ArrayAdapter
            .createFromResource(
                this, R.array.category_three,
                android.R.layout.simple_spinner_item
            )

        val staticAdapterFour = ArrayAdapter
            .createFromResource(
                this, R.array.category_four,
                android.R.layout.simple_spinner_item
            )

        // Specify the layout to use when the list of choices appears
        staticAdapterOne
            .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        staticAdapterTwo
            .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        staticAdapterThree
            .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        staticAdapterFour
            .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        category_one.adapter = staticAdapterOne
        category_two.adapter = staticAdapterTwo
        category_three.adapter = staticAdapterThree
        category_four.adapter = staticAdapterFour
    }
}
