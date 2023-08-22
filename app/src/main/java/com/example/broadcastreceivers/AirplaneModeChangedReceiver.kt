package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver : BroadcastReceiver() {

    val extraKEY : String = "state"
    override fun onReceive(context: Context?, intent: Intent?) {
        // TODO("Not yet implemented")
        val isAirPlaneModeEnabled = intent?.getBooleanExtra(extraKEY, false) ?: return
        if(isAirPlaneModeEnabled) {
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Airplane Mode disabled", Toast.LENGTH_LONG).show()
        }
    }
}