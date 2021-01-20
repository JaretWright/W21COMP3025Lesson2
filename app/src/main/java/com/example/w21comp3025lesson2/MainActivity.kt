package com.example.w21comp3025lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w21comp3025lesson2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.passwordEditText.text.toString().equals("1234"))
            {
                Snackbar.make(binding.constraintLayout,"Hello ${binding.userNameEditText.text}", Snackbar.LENGTH_INDEFINITE).show()
            }
        }
    }
}