package com.example.dagger_inj

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import javax.inject.Inject
interface UserRepo {
    fun saveuser(email: String, password: String)
}


    class SQLRepo @Inject constructor() : UserRepo {
        override fun saveuser(email: String, password: String) {
            Log.d("TAG", "User Saved in db")
        }
    }

    class FirebaseRepo @Inject constructor() : UserRepo {
        override fun saveuser(email: String, password: String) {
            Log.d("TAG", "User Saved in FB")
        }
    }
