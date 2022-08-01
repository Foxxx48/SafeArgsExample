package com.fox.safeargsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.fox.safeargsexample.databinding.Fragment1Binding
import com.fox.safeargsexample.databinding.Fragment3Binding


class Fragment3 : Fragment() {
    private var _binding: Fragment3Binding? = null
    private val binding get() = _binding!!
    val args: Fragment3Args by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment3Binding.inflate(layoutInflater, container, false)

//        val args: Fragment3Args by navArgs()
        val text = args.myArgs

        if (text == "") {
            binding.fr3Tv3.text = "EMPTY"
        } else {
            binding.fr3Tv3.text = text
        }
        return binding.root
    }


}