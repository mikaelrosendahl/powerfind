
package com.powerfind.powerfind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import kotlinx.serialization.descriptors.StructureKind
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Firebase.database.reference

          /*  // Set path to the database
              val database = Firebase.database
              val myRef = database.getReference("chargerstations")


              // Read from the database
              myRef.addValueEventListener(object : ValueEventListener {
                  override fun onDataChange(dataSnapshot: DataSnapshot) {
                      // This method is called once with the initial value and again
                      // whenever data at this location is updated.
                      val value = dataSnapshot.getValue<MyItem>()
                      Log.d("Debug", "Value is: $value")
                  }
                  override fun onCancelled(error: DatabaseError) {
                      // Failed to read value
                      Log.w("Debug", "Failed to read value.", error.toException())
                  }
              })*/
        var chargers = Stations("chargerstation")
    }

    public override fun onStart() {
        super.onStart()

    }

}