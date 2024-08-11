package com.example.dagger_inj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dagger_inj.ui.theme.Dagger_injTheme
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    @Inject
    lateinit var userRegSer: UserRegSer
    // Field Injection It tells dagger this field needs injection
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val component = DaggerUserRegInt.create()
//        component.getuserregser().let {
//            userRegSer = it
//        }
        setContent {
            Dagger_injTheme {

            }




        }




        userRegSer.registeruser("abc@gmail.com","1234")
    }
}

