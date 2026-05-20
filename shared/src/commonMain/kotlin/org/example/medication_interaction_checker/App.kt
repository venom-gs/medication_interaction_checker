package org.example.medication_interaction_checker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import org.example.medication_interaction_checker.viewModels.MedSearchViewModelTwo

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent : String by rememberSaveable { mutableStateOf("") }

        var medSearchViewModel: MedSearchViewModelTwo = MedSearchViewModelTwo()
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TextField(
                value = showContent,
                onValueChange = { newValue ->
                    showContent = newValue
                },
                label = { Text("hiii") })
            if (!showContent.isEmpty()){
                Button(onClick = { }) {
                    Text(showContent + medSearchViewModel.value.toString())
                }
            }
        }
    }
}
