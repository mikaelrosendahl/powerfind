package com.powerfind.powerfind

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Stations(
    var station: String = "chargerstation",
    var number: Int? = 1410,
    var att: String? = "csmd",
    var done: Boolean? = false
)