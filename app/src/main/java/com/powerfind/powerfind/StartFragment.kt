package com.powerfind.powerfind

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.powerfind.powerfind.R
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {

    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onStart() {
        super.onStart()

        auth = Firebase.auth

        if(auth.currentUser == null)
        {
            // VISA LOGIN
            Log.i("ALARMDEBUG", "INTE INLOGGAD")

            this.findNavController().navigate(R.id.action_startFragment_to_loginFragment)

        } else {
            // VISA MAIN
            Log.i("ALARMDEBUG", "INLOGGAD")

        }
        //skapar fun för knapp med findnavkontroll
        ProfilBtn.setOnClickListener {
            this.findNavController().navigate(R.id.action_startFragment_to_loginFragment)
        }
    }
}