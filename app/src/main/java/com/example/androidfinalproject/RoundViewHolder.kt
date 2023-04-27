package com.example.androidfinalproject

import Course
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfinalproject.databinding.ListItemLayoutBinding

class RoundViewHolder(val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentRound: Round

    init {
        binding.root.setOnClickListener { view ->
            Toast.makeText(
                view.context, currentRound.course.place + " clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    fun bindRound(round: Round) {
        currentRound = round
        binding.textViewCourseName.text = currentRound.course.place
        binding.textViewScore.text = if(currentRound.scoreToPar>1)"+${currentRound.scoreToPar}";else if(currentRound.scoreToPar < 0) currentRound.scoreToPar.toString(); else "E"
    }
}