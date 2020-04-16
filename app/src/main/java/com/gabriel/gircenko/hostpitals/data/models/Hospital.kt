package com.gabriel.gircenko.hostpitals.data.models

import com.gabriel.gircenko.hostpitals.enums.OrganisationStatus
import com.gabriel.gircenko.hostpitals.enums.OrganisationType
import com.gabriel.gircenko.hostpitals.enums.Sector

data class Hospital (val organisationID: Int?,
                     val organisationCode: String?,
                     val organisationType: OrganisationType?,
                     val subType: OrganisationType?,
                     val sector: Sector?,
                     val organisationStatus: OrganisationStatus?,
                     val isPimsManaged: Boolean?,
                     val organisationName: String?,
                     val address1: String?,
                     val address2: String?,
                     val address3: String?,
                     val city: String?,
                     val county: String?,
                     val postcode: String?,
                     val latitude: Double?,
                     val longitude: Double?,
                     val parentODSCode: String?,
                     val parentName: String?,
                     val phone: String?,
                     val email: String?,
                     val website: String?,
                     val fax: String?)