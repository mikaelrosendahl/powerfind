
package com.powerfind.powerfind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.powerfind.powerfind.R





class MainActivity : AppCompatActivity() {


    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Firebase.database.reference

        val database = Firebase.database
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")

    // Read from the database
    myRef.addValueEventListener(object : ValueEventListener {
        override fun onDataChange(dataSnapshot: DataSnapshot) {
          // This method is called once with the initial value and again
          // whenever data at this location is updated.
          val value = dataSnapshot.getValue<String>()
          Log.d("debug", "Value is: $value")

      }

      override fun onCancelled(error: DatabaseError) {
          // Failed to read value
          Log.w("debug", "Failed to read value.", error.toException())
      }
     })
    }


    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.


    }
}