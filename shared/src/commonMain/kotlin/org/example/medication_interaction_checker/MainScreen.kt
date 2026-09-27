package org.example.medication_interaction_checker

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.medication_interaction_checker.viewModels.MedSearchViewModelTwo

@Composable
fun MedTextContainer(medSearchViewModel : MedSearchViewModelTwo){
    val medArray = remember { mutableStateListOf<String>() }
    Box(modifier = Modifier.border(1.dp,
        color = Color.Gray,
        shape = RoundedCornerShape(8.dp)).heightIn(min = 175.dp)){
        Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Add Medicines",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold )
        Text(text = "Search and add medications you want to check")
        Column(modifier = Modifier.padding(0.dp,7.dp,0.dp,7.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)) {
            for (med in medArray){
                MedCard(false,onButtonClick={
                    medArray.remove(it)
                },med)
            }
            MedCard(true,{
                medArray.add(it)
            })
        }
            Button(onClick = {
                medSearchViewModel.getMedDetails()
            }) {
                Text("Search")
            }
    }
    }
}