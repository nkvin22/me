package com.example.me


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class NotificationFragment: Fragment(R.layout.fragment_notification) {

    private lateinit var next: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text = NotificationFragmentArgs.fromBundle(requireArguments()).name

        next = view.findViewById(R.id.next)

        next.setOnClickListener {

            val action =  NotificationFragmentDirections.actionNotificationFragmentToNewFragment2()

            findNavController().navigate(action)
        }

    }

}