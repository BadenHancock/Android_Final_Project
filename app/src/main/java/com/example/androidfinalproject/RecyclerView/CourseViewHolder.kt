package com.example.androidfinalproject.RecyclerView

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfinalproject.Objects.Course
import com.example.androidfinalproject.databinding.ListItemLayoutCourseBinding

class CourseViewHolder(val binding: ListItemLayoutCourseBinding) :
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

    fun bindRound(Course: Course) {
        currentCourse = Course
        binding.textViewCourseName.text = currentCourse.place.toString()
        binding.textViewTotalPar.text = "Par ${currentCourse.numOfHoles}"
        binding.textViewYardage.text = "7200 yards"
        binding.textViewCourseLocation.text = "Scranton Pennsylvania"
    }
}