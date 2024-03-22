package com.example.experiment

import javax.inject.Inject

class UserRegistrationService @Inject constructor ( //need to use 'constructor' keyword if using some annotation for constructor
    private val sqlRepository: SQlRepository,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String){
        sqlRepository.saveUser(email, password)
        notificationService.send(email, "mycompany.com", "You are registered")
    }
}


//Below is manual Implementation of DI

//class UserRegisterationService (
//    private val userRepository: UserRepository,
//    private val emailService: EmailService
//) {
//
//    fun registerUser(email: String, password: String){
//        userRepository.saveUser(email, password)
//        emailService.sendMail(email, "mycompany.com", "You are registered")
//    }
//}