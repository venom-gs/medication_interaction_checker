package org.example.medication_interaction_checker

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.example.medication_interaction_checker.viewModels.MedSearchViewModelTwo

@Composable
fun App() {
    MaterialTheme {
        var searchArray = mutableListOf<String>()
        var radioButtonValue : String by rememberSaveable { mutableStateOf("Y") }
        var medSearchViewModel: MedSearchViewModelTwo = MedSearchViewModelTwo()
        val state by medSearchViewModel.uiState.collectAsStateWithLifecycle()
        Column {
            Box(modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary).fillMaxWidth().height(55.dp), contentAlignment = Alignment.Center ){
                Text("Medi Check", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 25.sp)
            }
            Column(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .safeContentPadding()
                    .fillMaxSize(), verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                MedTextContainer(medSearchViewModel)
                DataDisplayContainer()
            }
        }
    }
}
