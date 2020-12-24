package com.example.hwandroidapplications

import android.app.IntentService
import android.content.Intent

class MathService : IntentService("MathService") {

    companion object {
        const val ACTION_NAME = "RESULT_CALCULATED"
        const val OUTPUT_KEY = "OUTPUT"
    }

    override fun onHandleIntent(startIntent: Intent?) {
        Thread.sleep(3000)

        val output: Int = (Math.random() * 10 + Math.random() * 10).toInt()
        val intent = Intent(ACTION_NAME)
        intent.putExtra(OUTPUT_KEY, output)
        sendBroadcast(intent)
    }
}