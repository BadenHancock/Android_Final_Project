package com.example.androidfinalproject.RecyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfinalproject.Objects.Course
import com.example.androidfinalproject.databinding.ListItemLayoutCourseBinding

class CourseAdapter(val CourseList: List<Course>) : RecyclerView.Adapter<CourseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val binding = ListItemLayoutCourseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(binding)
    }


    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val currentCourse = CourseList[position]
        holder.bindRound(currentCourse)
    }

    override fun getItemCount(): Int {
        return CourseList.size
    }
}