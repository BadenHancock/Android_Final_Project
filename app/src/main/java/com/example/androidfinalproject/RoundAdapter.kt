package com.example.androidfinalproject

import Course
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfinalproject.databinding.ListItemLayoutBinding

class RoundAdapter(val RoundList: List<Round>) : RecyclerView.Adapter<RoundViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoundViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RoundViewHolder(binding)
    }


    override fun onBindViewHolder(holder: RoundViewHolder, position: Int) {
        val currentRound = RoundList[position]
        holder.bindRound(currentRound)
    }

    override fun getItemCount(): Int {
        return RoundList.size
    }
}