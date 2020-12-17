package com.powerfind.powerfind

import com.google.android.gms.maps.model.LatLng
import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Stations(
    var station: String = "chargerstations",
    var att: String? = "csmd",
    var city: String = "City",
    var lat: Double = 59.86804,
    var lng: Double = 17.63715
)