package com.example.ch3_07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.button.visiblity = View.INVISIBLE
            binding.imageView.visiblity = View.VISIBLE
        }
        binding.imageView.setOnClickListener {
            binding.button.visiblity = View.VISIBLE
            binding.imageView.visiblity = View.INVISIBLE
        }
        setContentView(R.layout.activity_main)
    }
}