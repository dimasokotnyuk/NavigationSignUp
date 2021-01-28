package com.example.navigationsignup.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationsignup.R
import com.google.android.material.textfield.TextInputEditText

class FragmentSignUpPassword : Fragment() {

    private val args: FragmentSignUpPasswordArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nicknameValue = args.Nickname
        val emailValue = args.Email
        view.findViewById<Button>(R.id.bNext).setOnClickListener {
            val action = FragmentSignUpPasswordDirections.actionFragmentSignPasswordToFragmentInfo(
                nicknameValue,
                emailValue,
                view.findViewById<TextInputEditText>(R.id.etPassword).text.toString()
            )
            findNavController().navigate(action)
        }
    }
}
