package com.gabriel.gircenko.hostpitals.enums

enum class Sector {
    INDEPENDENT, NHS, UNKNOWN
}

fun String.toSector() : Sector = when (this) {
    "Independent Sector" -> Sector.INDEPENDENT
    "NHS Sector" -> Sector.NHS
    else -> Sector.UNKNOWN
}