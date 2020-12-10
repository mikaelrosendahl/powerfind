package com.powerfind.powerfind

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Stations(
    var station: String = "chargerstations",
)