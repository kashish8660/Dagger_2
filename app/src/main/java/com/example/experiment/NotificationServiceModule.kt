package com.example.experiment

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule {
    @ApplicationScope
    @MessageQualifier
    @Provides
    fun getMessageService(count: Int) : NotificationService {
        return MessageService(count)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService { //
        return emailService
    }

//    @Binds
//    abstract fun getMessageService(emailService: EmailService) : NotificationService
}