package org.example.medication_interaction_checker.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.example.medication_interaction_checker.ExtraFiles.createHttpClient
import org.example.medication_interaction_checker.Repos.MedSearchRepo
import org.example.medication_interaction_checker.Repos.User

data class UserUiState(
    val isLoading: Boolean = false,
    var users: List<User> = emptyList(),
    val error: String? = null
)

class MedSearchViewModelTwo: ViewModel() {

    private val _uiState = MutableStateFlow(UserUiState())
    val uiState: StateFlow<UserUiState> = _uiState

    var repo = MedSearchRepo(createHttpClient())
    init {

    }
    fun getMedDetails(){
        viewModelScope.launch {
            uiState.value.users = repo.getMedDetails()
        }
    }
}

