package com.example.navigationsignup.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationsignup.R

class FragmentInfo : Fragment() {
    private val args: FragmentInfoArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tvNickname).text = args.Nickname
        view.findViewById<TextView>(R.id.tvEmail).text = args.Email
        view.findViewById<TextView>(R.id.tvPassword).text = args.Password
    }
}