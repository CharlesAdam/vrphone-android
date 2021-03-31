package com.charlesadam.virtualphone.usecase

import com.charlesadam.virtualphone.data.model.NotificationData
import com.charlesadam.virtualphone.data.repository.CommunicationRepository

class SendNotificationUseCase(private val repository: CommunicationRepository) {

    fun execute(notificationData: NotificationData) {
        repository.sendNotificationData(notificationData)
    }
    
}