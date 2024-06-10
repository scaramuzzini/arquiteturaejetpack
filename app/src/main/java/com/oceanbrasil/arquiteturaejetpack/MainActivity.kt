package com.oceanbrasil.arquiteturaejetpack

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.oceanbrasil.arquiteturaejetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: OceanViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.counter.observe(this) {
            binding.textViewCounter.text = "Contador: $it"
        }

        binding.buttonAdd.setOnClickListener {
            Toast.makeText(this@MainActivity, "Add", Toast.LENGTH_SHORT).show()
            Log.d("ocean", "Clicou no botao")
            viewModel.incrementCounter()
        }
    }
}