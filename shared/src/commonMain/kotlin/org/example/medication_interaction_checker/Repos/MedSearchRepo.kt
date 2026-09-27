package org.example.medication_interaction_checker.Repos

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.Serializable

@Serializable
data class User(val id: Int, val name: String, val email: String)

class MedSearchRepo(private val client: HttpClient) {
    val constUrl = "https://rxnav.nlm.nih.gov/REST/"
    suspend fun getMedDetails(): List<User> {
        return client.get(constUrl + "interaction/list.json?rxcuis=" + "").body()
    }
}