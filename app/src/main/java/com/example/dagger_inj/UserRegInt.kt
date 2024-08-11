package com.example.dagger_inj

import dagger.Component

@Component
interface UserRegInt {
    fun getuserregser():UserRegSer
}