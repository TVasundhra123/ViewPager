package com.example.pager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pager.databinding.Fragment2Binding


class Fragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: Fragment2Binding
   // private val binding = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }


}