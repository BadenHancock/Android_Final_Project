package com.example.androidfinalproject

import Course
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfinalproject.databinding.ListItemLayoutBinding

class CourseViewHolder(val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var currentCourse: Course

    init {
        binding.root.setOnClickListener { view ->
            Toast.makeText(
                view.context, currentCourse.place + " clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    fun bindCourse(course: Course) {
        currentCourse = course
        binding.textViewCourseName.text = currentCourse.place
        binding.textViewScore.text = currentCourse.totalScore.toString()
    }
}
