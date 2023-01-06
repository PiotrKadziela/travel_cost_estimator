package com.example.travelcostestimator.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travelcostestimator.R
import com.example.travelcostestimator.databinding.ActivityMainBinding
import com.example.travelcostestimator.view.adapter.TripAdapter
import java.lang.System

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tripAdapter: TripAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tripAdapter = if (System.currentTimeMillis().toInt() % 2 == 0) {
            TripAdapter(arrayListOf("Twój stary"))
        } else {
            TripAdapter(arrayListOf("Twój stary"))
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTripList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = tripAdapter
        }

        if (tripAdapter.itemCount == 0) {
            binding.rvTripList.visibility = View.INVISIBLE
            binding.tvNoDataMessage.visibility = View.VISIBLE
        }

        binding.etSearch.isCursorVisible = false
        binding.etSearch.setOnFocusChangeListener { view: View, b: Boolean ->
            binding.etSearch.isCursorVisible = true
        }

        binding.btnNewTrip.setOnClickListener {
            val intent = Intent(this, NewTripActivity::class.java)
            startActivity(intent)
        }
    }
}