package com.charlesadam.virtualphone

import android.app.Application
import com.charlesadam.virtualphone.di.communicationRepositoryModule
import com.charlesadam.virtualphone.di.deviceCommunicationAPIModule
import com.charlesadam.virtualphone.di.sendNotificationUseCaseModule
import com.charlesadam.virtualphone.di.startServiceUseCase
import com.charlesadam.vrphone.library.Util
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(
                deviceCommunicationAPIModule,
                sendNotificationUseCaseModule,
                communicationRepositoryModule,
                startServiceUseCase
            ))
        }
        Util.startLogger()
    }
}