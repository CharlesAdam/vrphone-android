package com.charlesadam.virtualphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.charlesadam.virtualphone.services.PhoneNotificationListenerService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = Intent(this, PhoneNotificationListenerService::class.java)
        startService(service)
    }

    private fun checkNotificationAccessPermission(){
        //TODO: ASK PERMISSION TO READ NOTIFICATIONS
    }
}