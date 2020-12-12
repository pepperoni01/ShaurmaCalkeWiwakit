package com.example.shaurmacalkewiwakit

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class NotificationFragment : Fragment(R.layout.fragment_notifications) {
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        textView.text = NotificationFragmentArgs.fromBundle(requireArguments()).fasi.toString()
    }
}