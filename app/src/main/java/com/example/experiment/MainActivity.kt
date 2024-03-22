package com.example.experiment

//import UserApplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.dagger2.DaggerUserRegistrationComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService
//    @Inject
    lateinit var emailService1: EmailService
//    @Inject
    lateinit var emailService2: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component1= DaggerUserRegistrationComponent.factory().create(3)
        emailService1 = (application as UserApplication).component.getEmailService()
        emailService2 = (application as UserApplication).component.getEmailService()
//        val component2= DaggerUserRegistrationComponent.factory().create(3)
//        emailService2 = component2.getEmailService()

//        component.inject(this)
//        userRegistrationService.registerUser("kashis", "kk@123")
    }
}