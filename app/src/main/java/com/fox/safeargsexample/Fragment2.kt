package com.fox.safeargsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fox.safeargsexample.databinding.Fragment1Binding
import com.fox.safeargsexample.databinding.Fragment2Binding


class Fragment2 : Fragment() {
    private var _binding: Fragment2Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Binding.inflate(layoutInflater, container, false)
        val result = arguments?.getString("key1")

        println("result: $result")

        if (result == "") {
            binding.fr2Tv3.text = "Empty"
        } else {
            binding.fr2Tv3.text = arguments?.getString("key1")
        }
        return binding.root
    }


}