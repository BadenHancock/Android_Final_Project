package com.example.androidfinalproject

import Course
import Hole
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfinalproject.databinding.FragmentHomeBinding


class MainFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val ccsFalls: List<Hole> = listOf(
            Hole(520, 5), Hole(160, 3),
            Hole(350, 4), Hole(400, 4), Hole(480, 5),
            Hole(450, 4), Hole(420, 4), Hole(150, 3), Hole(450, 4)
        )
        // Inflate the layout for this fragment
        val courses = listOf(
            Course("Country Club of Scranton(Falls)", ccsFalls, 9, 36),

            )
        val round = listOf(
            Round(courses.get(0), listOf(5,4,4,4,5,4,3,3,5), calculateScoreToPar(listOf(5,4,4,4,5,4,3,3,5), courses.get(0))),
            Round(courses.get(0), listOf(5,3,4,4,5,4,3,3,5), calculateScoreToPar(listOf(5,3,4,4,5,4,3,3,5), courses.get(0))),
            Round(courses.get(0), listOf(5,2,4,4,5,4,3,3,5), calculateScoreToPar(listOf(5,4,4,4,5,4,3,3,5), courses.get(0)))
        )

        val myAdapter = RoundAdapter(round)
        binding.recyclerView.adapter = myAdapter

        return rootView
    }

    fun calculateScoreToPar( score : List<Int>, course : Course) : Int{
        var totalScore = 0
        for(each in score)
            totalScore+=each
        return totalScore-course.totalPar
    }
}
