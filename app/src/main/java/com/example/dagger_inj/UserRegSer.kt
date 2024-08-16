package com.example.dagger_inj

import android.app.Notification
import javax.inject.Inject

class UserRegSer @Inject constructor(
    private val userrepo: UserRepo,
    private val notification: Notificationser
) {
    fun registeruser(email:String,password:String){
        userrepo.saveuser(email,password)
        notification.send(email,"npt@gmail.com","user registerd")
    }
}