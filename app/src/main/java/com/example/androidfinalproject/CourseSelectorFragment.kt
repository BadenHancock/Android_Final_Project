package com.example.androidfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfinalproject.databinding.FragmentCourseSelectorBinding
import com.example.androidfinalproject.databinding.FragmentHomeBinding

class CourseSelectorFragment : Fragment() {

    private var _binding: FragmentCourseSelectorBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCourseSelectorBinding.inflate(inflater, container, false)
        val rootView = binding.root
        return rootView
    }
}