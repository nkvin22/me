package com.example.me


import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class NewFragment: Fragment(R.layout.fragment_new) {

    private lateinit var me: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        me = view.findViewById(R.id.me)





    }

}