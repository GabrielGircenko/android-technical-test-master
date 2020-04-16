package com.gabriel.gircenko.hostpitals.enums

enum class OrganisationType {
    HOSPITAL, MENTAL_HEALTH_HOSPITAL, UNKNOWN
}

fun String.toOraganisationType(): OrganisationType = when (this) {
    "Hospital" -> OrganisationType.HOSPITAL
    "Mental Health Hospital" -> OrganisationType.MENTAL_HEALTH_HOSPITAL
    else -> OrganisationType.UNKNOWN
}