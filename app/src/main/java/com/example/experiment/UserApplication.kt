package com.example.experiment

import android.app.Application
import com.example.experiment.DaggerUserRegistrationComponent
import com.example.experiment.UserRegistrationComponent

class UserApplication : Application() {
lateinit var component: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        component= DaggerUserRegistrationComponent.factory().create(3)
    }
}