package com.example.experiment

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to : String, from : String, body : String)
}

@ApplicationScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to : String, from : String, body : String){
        Log.d(TAG, "Email is sent")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to : String, from : String, body : String){
        Log.d(TAG, "Message is sent - Retry Count $retryCount")
    }
}