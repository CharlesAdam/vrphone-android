package com.charlesadam.virtualphone.data.repository

import com.charlesadam.virtualphone.data.model.NotificationData

interface CommunicationRepository {
    fun sendNotificationData(notificationData: NotificationData)

    fun startNotificationService()
}