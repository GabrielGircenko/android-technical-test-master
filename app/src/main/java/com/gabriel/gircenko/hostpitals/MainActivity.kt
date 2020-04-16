package com.gabriel.gircenko.hostpitals

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.gabriel.gircenko.hostpitals.data.models.Hospital
import com.gabriel.gircenko.hostpitals.enums.toOraganisationType
import com.gabriel.gircenko.hostpitals.enums.toOrganisationStatus
import com.gabriel.gircenko.hostpitals.enums.toSector
import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.BufferedReader
import java.io.InputStream


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        parseCSV()
    }

    // TODO move to background thread or coroutine
    private fun parseCSV(): List<Hospital> {
        val inputStream: InputStream = resources.openRawResource(R.raw.hospital)

        val reader = BufferedReader(inputStream.reader())
        var content = ""
        reader.use { reader ->
            content = reader.readText()
        }

        val rows: List<Map<String, String>> = csvReader().readAllWithHeader(content)
        val resultList = ArrayList<Hospital>()
        for (row in rows) {
            resultList.add(Hospital(
                    row["OrganisationID"]?.toInt(),
                    row["OrganisationCode"],
                    row["OrganisationType"]?.toOraganisationType(),
                    row["SubType"]?.toOraganisationType(),
                    row["Sector"]?.toSector(),
                    row["OrganisationStatus"]?.toOrganisationStatus(),
                    row["IsPimsManaged"]?.toBoolean(),
                    row["OrganisationName"],
                    row["Address1"],
                    row["Address2"],
                    row["Address3"],
                    row["City"],
                    row["County"],
                    row["Postcode"],
                    row["Latitude"]?.toDouble(),
                    row["Longitude"]?.toDouble(),
                    row["ParentODSCode"],
                    row["ParentName"],
                    row["Phone"],
                    row["Email"],
                    row["Website"],
                    row["Fax"]
            ))
        }

        Log.d("size:", rows.size.toString())
        return resultList
    }
}