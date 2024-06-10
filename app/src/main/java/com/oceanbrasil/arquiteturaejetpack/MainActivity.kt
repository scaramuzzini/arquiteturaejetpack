package com.oceanbrasil.arquiteturaejetpack

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.oceanbrasil.arquiteturaejetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonAdd.setOnClickListener {
            Toast.makeText(this@MainActivity, "Add", Toast.LENGTH_SHORT).show()
            Log.d("ocean", "Clicou no botao")
            counter = counter + 1

            binding.textViewCounter.text = "Contador: ${counter}"
        }


    }
}