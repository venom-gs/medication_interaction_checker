package org.example.medication_interaction_checker

import android.os.Build
import androidx.compose.runtime.Composable

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
@Composable
actual fun ToasterUi(message: String) {

//    Toast.makeText(
//        applicationContext,
//        message,
//        Toast.LENGTH_SHORT
//    ).show()
}