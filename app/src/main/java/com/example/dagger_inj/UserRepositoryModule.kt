package com.example.dagger_inj

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {
//    @Provides
//    fun getfbrepo():UserRepo{
//        return FirebaseRepo()
//    }
    @Binds
    abstract fun getsqlrepo(sqlRepo: SQLRepo):UserRepo
    //we have done this becaus dagger can make sqlrepo object by itself as we have used constructor injection in sqlrepo

}