package com.charlesadam.virtualphone.utils

import android.app.Notification

object NotificationUtils {

    fun Notification.getTitle(): String? {
        return this.extras.getString(NOTIFICATION_TITLE)
    }

    fun Notification.getDescription(): String? {
        return this.extras.getString(NOTIFICATION_TEXT)
    }

    private const val NOTIFICATION_TITLE = ""
    private const val NOTIFICATION_TEXT = ""
}
