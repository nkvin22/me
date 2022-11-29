package com.example.me


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment


class NotificationFragment: Fragment(R.layout.fragment_notification) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text = NotificationFragmentArgs.fromBundle(requireArguments()).name

    }

}