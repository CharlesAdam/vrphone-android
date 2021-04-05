package com.charlesadam.virtualphone.data.api

import com.charlesadam.virtualphone.data.model.NotificationData
import com.charlesadam.virtualphone.data.model.toInfo
import com.charlesadam.vrphone.library.VRPhoneConnectionManager

class DeviceCommunicationAPIImpl:DeviceCommunicationAPI {
    val connectionManager = VRPhoneConnectionManager()
    override fun sendNotificationData(data: NotificationData) {
        connectionManager.sendNotification(data.toInfo())
    }

    override fun startNotificationService() {
        connectionManager.startMessagingServer()
    }
}