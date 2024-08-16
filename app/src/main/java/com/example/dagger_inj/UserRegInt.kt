package com.example.dagger_inj

import dagger.Component


//here we tell the component that we are using these modules to call for the objects
@Component(modules = [UserRepositoryModule::class,NotiSerModule::class])
interface UserRegInt {
//    fun getuserregser():UserRegSer
    fun inject(mainActivity: MainActivity)
}