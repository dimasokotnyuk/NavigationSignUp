package com.example.navigationsignup.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationsignup.R
import com.google.android.material.textfield.TextInputEditText

class FragmentSignUpNickname : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up_nickname, container, false)
        view.findViewById<Button>(R.id.bNext).setOnClickListener {
            val action =
                FragmentSignUpNicknameDirections.actionFragmentSignNicknameToFragmentSignUpEmail(
                    view.findViewById<TextInputEditText>(R.id.etNickname).text.toString()
                )
            view.findNavController().navigate(action)
        }
        return view
    }

}