package com.charlesadam.virtualphone.di

import com.charlesadam.virtualphone.usecase.SendNotificationUseCase
import com.charlesadam.virtualphone.usecase.StartServiceUseCase
import org.koin.dsl.module

val sendNotificationUseCaseModule = module {
    single { SendNotificationUseCase(get()) }
}

val startServiceUseCase = module {
    single { StartServiceUseCase(get()) }
}