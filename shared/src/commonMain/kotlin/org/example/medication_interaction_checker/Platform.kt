package org.example.medication_interaction_checker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform