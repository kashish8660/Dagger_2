package com.example.experiment

import android.app.AppComponentFactory
import dagger.BindsInstance
import dagger.Component
import dagger.Component.Builder
import javax.inject.Singleton

@ApplicationScope
@Component( modules = [NotificationServiceModule::class, AnalyticsModule::class])
interface UserRegistrationComponent {

//    fun getUserRegistrationService() : UserRegistrationService

//    fun getEmailService(): EmailService

    fun inject(mainActivity: MainActivity)
    fun getEmailService() : EmailService

    @Component.Factory
    interface Factory {

//        fun build() : UserRegistrationComponent
//        fun retryCount(@BindsInstance retryCount: Int): Builder //for every parameter(retryCount) passed in factory pattern, we need create a function in Builder patter
//
        fun create(@BindsInstance retryCount: Int) : UserRegistrationComponent //returns Component and not UserRegistrationService
//    making the component take the retryCount and not the Module.
    }
}
