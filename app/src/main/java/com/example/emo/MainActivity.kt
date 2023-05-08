package com.example.emo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.emo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
    fun topla (view : View) {
        val x = binding.editTextText14.text.toString().toIntOrNull()
        val y = binding.editTextText15.text.toString().toIntOrNull()
        if(x == null || y == null) {
            binding.textView13.text = "Yanlis girdin."
        }
        else {
            binding.textView13.text = "Sonuc = ${x+y}"
        }
    }
    fun carp (view : View) {
        val x = binding.editTextText14.text.toString().toIntOrNull()
        val y = binding.editTextText15.text.toString().toIntOrNull()
        if(x == null || y == null) {
            binding.textView13.text = "Yanlis girdin."
        }
        else {
            binding.textView13.text = "Sonuc = ${x*y}"
        }
    }

    fun cikar (view : View) {
        val x = binding.editTextText14.text.toString().toIntOrNull()
        val y = binding.editTextText15.text.toString().toIntOrNull()
        if(x == null || y == null) {
            binding.textView13.text = "Yanlis girdin."
        }
        else {
            binding.textView13.text = "Sonuc = ${x-y}"
        }
    }
    fun bol (view : View) {
        val x = binding.editTextText14.text.toString().toDoubleOrNull()
        val y = binding.editTextText15.text.toString().toDoubleOrNull()
        if(x == null || y == null) {
            binding.textView13.text = "Yanlis girdin."
        }
        else {
            binding.textView13.text = "Sonuc = ${x/y}"
        }
    }

}