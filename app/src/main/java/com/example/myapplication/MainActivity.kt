package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sila.setOnClickListener{
            Intent(this,SilaTeze::class.java).also{ startActivity(it) }
        }
        binding.gravitacija.setOnClickListener{
            Intent(this, SilaGravizacije::class.java).also{ startActivity(it) }
        }
    }
}
