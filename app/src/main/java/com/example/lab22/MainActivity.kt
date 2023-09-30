package com.example.lab22

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.blackTextButton.setOnClickListener { setBlackText() }
        binding.RedTextButton.setOnClickListener { setRedText() }
        binding.Sise8Button.setOnClickListener { setSise8() }
        binding.Sise24Button.setOnClickListener { setSise24() }
        binding.BackgroundWhite.setOnClickListener {setBackgroundWhite()}
        binding.BackgroudYellow.setOnClickListener {setBackgroundYellow()}
    }
    private fun setBlackText(){
        binding.EditText.setTextColor(Color.BLACK)
    }
    private fun setRedText(){
        binding.EditText.setTextColor(Color.RED)
    }
    private fun setSise8(){
        binding.EditText.setTextSize(8F)
    }
    private fun setSise24(){
        binding.EditText.setTextSize(24F)
    }
    private fun setBackgroundWhite(){
        binding.EditText.setBackgroundColor(Color.WHITE)
    }
    private fun setBackgroundYellow(){
        binding.EditText.setBackgroundColor(Color.YELLOW)
    }
}