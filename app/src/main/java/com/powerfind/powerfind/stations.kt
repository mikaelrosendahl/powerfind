package com.powerfind.powerfind

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Stations(
    var charger: String? = "chargerstations",
    var number: Int? = 1410,
    var att: String? = "csmd",
    var done: Boolean? = false
)