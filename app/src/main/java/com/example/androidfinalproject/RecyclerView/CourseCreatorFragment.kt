package com.example.androidfinalproject.RecyclerView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfinalproject.databinding.FragmentCourseCreatorBinding
import com.example.androidfinalproject.databinding.FragmentCourseSelectorBinding
import com.example.androidfinalproject.databinding.ListItemLayoutCourseBinding.inflate

class CourseCreatorFragment : Fragment() {

    private var _binding: FragmentCourseCreatorBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCourseCreatorBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }
}