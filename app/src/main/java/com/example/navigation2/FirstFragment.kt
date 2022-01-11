package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigation2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding : FragmentFirstBinding =  DataBindingUtil.inflate(inflater,R.layout.fragment_first, container, false)
        val view = binding.root

          binding.fragment1TextView.setOnClickListener {
              Navigation.findNavController(view).navigate(R.id.firstFragmentToSecondFragment)
          }
        return view
    }
}