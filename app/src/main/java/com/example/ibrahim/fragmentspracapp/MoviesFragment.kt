package com.example.ibrahim.fragmentspracapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class MoviesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.fragment_movies,container,false)
        // Inflate the layout for this fragment
        return view
    }


}
