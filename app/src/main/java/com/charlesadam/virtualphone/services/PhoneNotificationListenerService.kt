package com.charlesadam.virtualphone.services

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import com.charlesadam.virtualphone.InvalidNotificationException
import com.charlesadam.virtualphone.ResultResponse
import com.charlesadam.virtualphone.usecase.SendNotificationUseCase
import com.charlesadam.virtualphone.data.model.NotificationData
import com.charlesadam.virtualphone.usecase.StartServiceUseCase
import com.charlesadam.virtualphone.utils.NotificationUtils.getDescription
import com.charlesadam.virtualphone.utils.NotificationUtils.getTitle
import org.koin.android.ext.android.inject

class PhoneNotificationListenerService() : NotificationListenerService() {

    private val sendNotificationUseCase: SendNotificationUseCase by inject()
    private val startServiceUseCase: StartServiceUseCase by inject()

    override fun onListenerConnected() {
        //TODO: GET CURRENT NOTIFICATIONS AND SEND TO USER
        super.onListenerConnected()
        startServiceUseCase.execute()
    }

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)
        handleNotification(sbn)
    }

    private fun handleNotification(sbn: StatusBarNotification?) {
        fetchNotificationData(sbn).run {
            when (this) {
                is ResultResponse.Success<*> -> {
                    sendNotificationUseCase.execute(this.data as NotificationData)
                }

                is ResultResponse.Error -> {
                    //Handle Error

                }
            }
        }
    }

    private fun fetchNotificationData(sbn: StatusBarNotification?): ResultResponse {
        sbn?.notification?.run {
            return ResultResponse.Success(
                NotificationData(
                    this.getTitle() ?: return@run,
                    this.getDescription() ?: return@run,
                    sbn.packageName
                )
            )
        }
        return ResultResponse.Error(InvalidNotificationException())
    }
}