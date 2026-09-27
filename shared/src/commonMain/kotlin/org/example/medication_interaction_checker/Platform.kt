package org.example.medication_interaction_checker

import androidx.compose.runtime.Composable

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

@Composable
expect fun ToasterUi(message : String)