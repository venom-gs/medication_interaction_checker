package org.example.medication_interaction_checker.Repos

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.Serializable

@Serializable
data class User(val id: Int, val name: String, val email: String)

class MedSearchRepo(private val client: HttpClient) {
    suspend fun getUsers(): List<User> {
        return client.get("https://jsonplaceholder.typicode.com/users").body()
    }
}