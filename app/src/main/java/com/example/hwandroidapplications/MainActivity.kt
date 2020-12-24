package com.example.hwandroidapplications

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerReceiver(MathReceiver(), IntentFilter(MathService.ACTION_NAME))
        startService(Intent(this, MathService::class.java))
    }
}