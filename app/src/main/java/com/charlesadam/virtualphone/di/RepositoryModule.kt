package com.charlesadam.virtualphone.di

import com.charlesadam.virtualphone.data.repository.CommunicationRepository
import com.charlesadam.virtualphone.data.repository.CommunicationRepositoryImpl
import org.koin.dsl.module

val communicationRepositoryModule = module {
    single<CommunicationRepository> { CommunicationRepositoryImpl(get()) }
}