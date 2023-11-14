package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySilaGravizacijeBinding

class SilaGravizacije : AppCompatActivity() {
    lateinit var binding: ActivitySilaGravizacijeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySilaGravizacijeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.racun.setOnClickListener{
            val masa1 = binding.masa1.text.toString().toFloatOrNull()
            val masa2 = binding.masa2.text.toString().toFloatOrNull()
            val udaljenost = binding.udaljenost.text.toString().toFloatOrNull()
            val G=0.0000000000667
            if ((masa1 != null) && (masa2 != null)) {
                val SilaGravizacije =(masa1*masa2)/(udaljenost?.times(udaljenost!!)!!)*G
                binding.rjesenje.text = SilaGravizacije.toString()
            }
            else {
                binding.rjesenje.text = "Unesit brojeve u polja"
            }
        }
    }
}