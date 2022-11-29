package com.example.me


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DashboardFragment: Fragment(R.layout.fragment_dashboard) {

    private lateinit var editText: EditText
    private lateinit var button: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editTextTextPersonName)
        button = view.findViewById(R.id.button)

        button.setOnClickListener {

            val name = editText.text.toString()

            val action = DashboardFragmentDirections.actionDashboardFragmentToNotificationFragment(name)

            findNavController().navigate(action)

        }

    }

}