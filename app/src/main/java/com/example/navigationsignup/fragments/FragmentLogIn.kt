package com.example.navigationsignup.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationsignup.R

class FragmentLogIn : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        view.findViewById<TextView>(R.id.tvStartRegistration).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_fragmentLogIn_to_fragmentSignNickname)
        }

        return view
    }
}