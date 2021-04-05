package com.charlesadam.virtualphone.data.model

import com.charlesadam.vrphone.library.NotificationInfo

data class NotificationData (
    val title: String,
    val content: String,
    val app: String
)

fun NotificationData.toInfo(): NotificationInfo {
    return NotificationInfo(title, content, app)
}