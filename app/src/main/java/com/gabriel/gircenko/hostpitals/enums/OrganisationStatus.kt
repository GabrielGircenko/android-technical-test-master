package com.gabriel.gircenko.hostpitals.enums

enum class OrganisationStatus {
    VISIBLE, INVISIBLE
}

fun String.toOrganisationStatus() : OrganisationStatus = when(this) {
    "Visible" -> OrganisationStatus.VISIBLE
    else -> OrganisationStatus.INVISIBLE
}