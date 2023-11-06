package com.example.hafezpoem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hafezpoem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fortuneButton: Button = binding.button
        fortuneButton.setOnClickListener {
            when ((1..5).random()) {
                1 -> binding.text.text = getText(R.string.poem1)
                2 -> binding.text.text = getText(R.string.poem2)
                3 -> binding.text.text = getText(R.string.poem3)
                4 -> binding.text.text = getText(R.string.poem4)
                5 -> binding.text.text = getText(R.string.poem5)
            }

        }
        val aboutButton: Button = binding.aboutButton
        aboutButton.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

    }


}