package com.example.hwandroidapplications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MathReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.also {
            val result = it.getIntExtra(MathService.OUTPUT_KEY, -1)
            (context as AppCompatActivity?)?.supportFragmentManager
                ?.beginTransaction()
                ?.add(R.id.container, OutputFragment.getFragment(result))
                ?.commit()
        }
    }
}