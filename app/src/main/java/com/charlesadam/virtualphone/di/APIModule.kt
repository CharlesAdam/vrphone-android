package com.charlesadam.virtualphone.di

import com.charlesadam.virtualphone.data.api.DeviceCommunicationAPI
import com.charlesadam.virtualphone.data.api.DeviceCommunicationAPIImpl
import org.koin.dsl.module

val deviceCommunicationAPIModule = module {
    single<DeviceCommunicationAPI> { DeviceCommunicationAPIImpl()}
}