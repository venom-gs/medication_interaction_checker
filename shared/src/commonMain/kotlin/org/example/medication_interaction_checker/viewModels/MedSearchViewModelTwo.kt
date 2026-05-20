package org.example.medication_interaction_checker.viewModels

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.launch
import org.example.medication_interaction_checker.ExtraFiles.createHttpClient
import org.example.medication_interaction_checker.Repos.MedSearchRepo
import org.example.medication_interaction_checker.Repos.User
import kotlin.math.log

class MedSearchViewModelTwo: ViewModel() {
    var value : List<User>? = null
    var repo = MedSearchRepo(createHttpClient())
    init {
        viewModelScope.launch {
            value = repo.getUsers()
        }
    }
}

