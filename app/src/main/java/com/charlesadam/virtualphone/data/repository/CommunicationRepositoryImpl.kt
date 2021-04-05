package com.charlesadam.virtualphone.data.repository

import com.charlesadam.virtualphone.data.api.DeviceCommunicationAPI
import com.charlesadam.virtualphone.data.model.NotificationData

class CommunicationRepositoryImpl(private val api: DeviceCommunicationAPI) :
    CommunicationRepository {

    override fun sendNotificationData(notificationData: NotificationData) {
        api.sendNotificationData(notificationData)
    }

    override fun startNotificationService() {
        api.startNotificationService()
    }
}