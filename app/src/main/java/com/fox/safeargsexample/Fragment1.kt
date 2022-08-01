package com.fox.safeargsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fox.safeargsexample.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(layoutInflater, container, false)
        val myBundle = Bundle()

        binding.fr1Btn2Send.setOnClickListener {
            val textBundle = binding.fr1Et2.text.toString()

            myBundle.putString("key1", textBundle)

            println("Result 1: " + myBundle.getString("key1"))

            findNavController().navigate(R.id.action_fragment1_to_fragment2, myBundle)
        }

        binding.fr1Btn1Send.setOnClickListener{
            val textSafe = binding.fr1Et1.text.toString()

            val action = Fragment1Directions.actionFragment1ToFragment3(textSafe)

            println("Result2:  $textSafe")

            findNavController().navigate(action)
        }

        return binding.root
    }


}