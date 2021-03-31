package com.charlesadam.virtualphone.data.api

import com.charlesadam.virtualphone.data.model.NotificationData

interface DeviceCommunicationAPI {
    fun sendNotificationData(data: NotificationData)

    fun startNotificationService()
}