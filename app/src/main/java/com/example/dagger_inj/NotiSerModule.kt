package com.example.dagger_inj

import dagger.Module
import dagger.Provides

@Module
class NotiSerModule {
    @Provides
    fun getmessgSer(): Notificationser{
        return MessageSer()
    }
}