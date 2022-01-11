package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import com.example.navigation2.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding : FragmentSecondBinding  = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
        val view = binding.root
        binding.fragment2TextView.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.secondFragmentToFirstFragment)
        }

        return view
    }

}