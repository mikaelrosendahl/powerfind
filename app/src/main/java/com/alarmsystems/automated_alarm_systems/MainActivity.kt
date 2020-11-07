package com.alarmsystems.automated_alarm_systems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.settingsadapterfragment.*


    //Firebase instance
    private lateinit var auth: FirebaseAuth

class MainActivity : AppCompatActivity() {
    //Creates instance of adapter
    var theadapter = Settingsadapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create ref ref to aadapter with layout
        theRecView.layoutManager = LinearLayoutManager(this)
        theRecView.adapter = theadapter

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

            //Todo lyssna med Bill!!
            this.findNavController().navigate(R.id.action_startFragment_to_loginFragment)

        } else {
            // VISA MAIN
            Log.i("ALARMDEBUG", "INLOGGAD")

        }
    }
}