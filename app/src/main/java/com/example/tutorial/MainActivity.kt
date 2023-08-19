package com.example.tutorial

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.example.tutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Use binding.root to set the content view

        binding.btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = binding.rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)

            val cheese = binding.cbCheese.isChecked
            val onions = binding.cbOnions.isChecked
            val salad = binding.cbSalad.isChecked

            val orderString = "You ordered a burger with:\n" +
                    "${meat.text}" +
                    (if (cheese) "\nCheese" else "") +
                    (if (onions) "\nOnions" else "") +
                    (if (salad) "\nSalad" else "")

            // Display the order message
            binding.tvOrder.text = orderString
        }
    }
}



/* binding.btnApply.setOnClickListener(){
     val  firstName = binding.etFirstName.text.toString()
     val  lastName = binding.etLastName.text.toString()
     val  birthDate = binding.etBirthDate.text.toString()
     val  country = binding.etCountry.text.toString()
     Log.d("MainActivity", "$firstName $lastName, born on $birthDate, from $country just applied to the formula")

 */