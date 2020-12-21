package com.powerfind.powerfind

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Stations(
    var station: String = "chargerstations",
    var att: String? = "csmd",
    var city: String = "City",
    var lat: Double = 0.0,
    var lng: Double = 0.0
)