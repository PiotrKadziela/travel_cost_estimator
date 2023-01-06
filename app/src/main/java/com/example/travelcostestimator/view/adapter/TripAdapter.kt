package com.example.travelcostestimator.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelcostestimator.databinding.TripListItemBinding

class TripAdapter(private val trips: ArrayList<String>) : RecyclerView.Adapter<TripAdapter.TripViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripViewHolder {
        return TripViewHolder(TripListItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: TripViewHolder, position: Int) {
        holder.binding.tvDestination.text = trips[position]
    }

    override fun getItemCount(): Int {
        return trips.size
    }

    class TripViewHolder(val binding: TripListItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}