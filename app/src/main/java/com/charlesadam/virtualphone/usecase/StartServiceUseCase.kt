package com.charlesadam.virtualphone.usecase

import com.charlesadam.virtualphone.data.repository.CommunicationRepository

class StartServiceUseCase(private val repository: CommunicationRepository) {

    fun execute(){
        repository.startNotificationService()
    }

}