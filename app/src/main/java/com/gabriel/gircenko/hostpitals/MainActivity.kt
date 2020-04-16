package com.gabriel.gircenko.hostpitals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gabriel.gircenko.hostpitals.data.models.Hospital

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun parseCSV(s: String) : List<String> {
        var list: List<String> = s.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)".toRegex())
        Log.d("size:", list.size.toString() + " - subjects:" + list[2])
        return list
    }
}