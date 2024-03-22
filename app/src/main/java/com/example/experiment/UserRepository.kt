package com.example.experiment

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ApplicationScope
class SQlRepository @Inject constructor(val analyticsService: AnalyticsService): UserRepository  { //as dagger know how to create object of AnalyticsService(due to @Provides)
    override fun saveUser(email : String, password: String){
        Log.d(TAG, "user is saved in DB")
        analyticsService.trackEvent("Save User", "Create")
    }
}

//class FirebaseRepository (val analyticsService: AnalyticsService) : UserRepository {
//    override fun saveUser(email : String, password: String){
//        Log.d(TAG, "user is saved in Firebase")
//        analyticsService.trackEvent("Save User", "Create")
//    }
//}