package com.example.dagger_inj

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
interface Notificationser{
    fun send(to:String,from:String,body:String?)
}

class EmailSer @Inject constructor():Notificationser{
    override fun send(to:String, from:String, body:String?){
        Log.d("TAG","Email sent")
    }
}
class MessageSer:Notificationser{
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG","Msg sent")
    }

}