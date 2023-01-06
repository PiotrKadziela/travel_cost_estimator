package com.example.travelcostestimator.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travelcostestimator.R
import com.example.travelcostestimator.databinding.ActivityNewTripBinding

class NewTripActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewTripBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_trip)

        binding = ActivityNewTripBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}