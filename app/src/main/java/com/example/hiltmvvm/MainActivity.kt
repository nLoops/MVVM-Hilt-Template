package com.example.hiltmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val API = "https://docs.opencollective.com/help/contributing/development/api/members"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}