package com.powerfind.powerfind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase



//Firebase instance
    private lateinit var auth: FirebaseAuth

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //ref to firebase auth
        auth = Firebase.auth
    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.

        if(auth.currentUser == null)
        {
            // VISA LOGIN
            Log.i("ALARMDEBUG", "INTE INLOGGAD")

            this.findNavController(R.id.fragment).navigate(R.id.action_startFragment_to_loginFragment)

        } else {
            // VISA MAIN
            Log.i("ALARMDEBUG", "INLOGGAD")

        }
    }
}