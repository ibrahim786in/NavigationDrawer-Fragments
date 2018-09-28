package com.example.ibrahim.fragmentspracapp

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class HomeFragment : Fragment() {

    var tagN = "FragmentHome"

    override fun onAttach(context: Context?) {
        Log.i(tagN, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(tagN, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        Log.i(tagN, "onCreateView")
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i(tagN, "onActivityCreated")

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i(tagN, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(tagN, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(tagN, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(tagN, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i(tagN, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(tagN, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(tagN, "onDetach")
        super.onDetach()
    }
}
