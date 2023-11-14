package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySilaTezeBinding

class SilaTeze : AppCompatActivity() {
    lateinit var binding: ActivitySilaTezeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySilaTezeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.racun.setOnClickListener{
            val m = binding.tekst.text.toString().toFloatOrNull()
            if (m != null && m != 0.0f) {
                val g = 9.81
                val kraj=m*g
                binding.kraj.text = g.toString()
            }
            else
            {
                binding.kraj.text = "Unesite valjan broj koji nije nula"
            }
        }
    }
}