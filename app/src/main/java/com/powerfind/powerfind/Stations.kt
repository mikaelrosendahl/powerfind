package com.powerfind.powerfind

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Stations(
    var station: String = "chargerstations",
    var number: Int? = 1410,
    var att: String? = "csmd",

)