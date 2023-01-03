package com.example.travelcostestimator.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.travelcostestimator.R
import com.example.travelcostestimator.databinding.ActivityMainBinding
import com.example.travelcostestimator.view.adapter.TripAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tripAdapter: TripAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tripAdapter = TripAdapter(arrayListOf("Canada"))
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTripList.apply {
            layoutManager = GridLayoutManager(
                this@MainActivity,
                1,
                GridLayoutManager.VERTICAL,
                false
            )
            adapter = tripAdapter
        }


    }
}