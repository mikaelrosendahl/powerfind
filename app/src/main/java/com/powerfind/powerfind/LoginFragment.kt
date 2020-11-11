package com.powerfind.powerfind

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.powerfind.powerfind.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    var auth: FirebaseAuth = Firebase.auth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        val usernameEditText = emailET
        val passwordEditText = passwordET

        loginBtn.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            auth.signInWithEmailAndPassword(username, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    //container.findNavController().popBackStack()
                    this.findNavController()
                        .navigate(R.id.action_loginFragment_to_mapsfragment)
                }
            }
        }

        regBtn.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            auth.createUserWithEmailAndPassword(username, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {

                    this.findNavController().popBackStack()
                }
            }
        }
    }
}