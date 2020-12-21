
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

    var allStations = mutableListOf<Stations>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Firebase.database.reference

        // Set path to the database
        val database = Firebase.database

        val stationListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                // Get Post object and use the values to update the UI
                for (chargerchild in dataSnapshot.children){

                    var tempStation = Stations()
                    val cityValue = chargerchild.child("csmd").child("City").getValue<String>()
                    var positionValue = chargerchild.child("csmd").child("Position").getValue<String>()

                    positionValue = positionValue!!.removePrefix("(")
                    positionValue = positionValue!!.removeSuffix(")")

                    var lat = positionValue.substringBefore(",").toDouble()
                    var lng = positionValue.substringAfter(",").toDouble()

                    Log.i("Debug", cityValue!! + " " + positionValue!!)

                    tempStation.station = cityValue
                    allStations.add(tempStation)

                }

            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.w("Debug", "loadPost:onCancelled", databaseError.toException())

            }
        }
        database.getReference("chargerstations").addListenerForSingleValueEvent(stationListener)

        }
    public override fun onStart() {
        super.onStart()
    }
}


