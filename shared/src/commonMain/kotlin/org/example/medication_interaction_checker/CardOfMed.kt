package org.example.medication_interaction_checker

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun MedCard(isAdd : Boolean,onButtonClick : (String) -> Unit , med: String = ""){
    Box(modifier = Modifier.border(1.dp,
        color = Color.Gray,
        shape = RoundedCornerShape(8.dp))
        .fillMaxWidth()){
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            var text : String by rememberSaveable { mutableStateOf(med) }
            if (isAdd) {
                TextField(
                    value = text,
                    enabled = isAdd,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent,
                        errorContainerColor = Color.Transparent
                    ),
                    onValueChange = { newText -> text = newText },
                    label = {
                        Text("Enter your name")
                    }
                )
            }
            else{
                Text(med, color = Color.Gray
                , modifier = Modifier.padding(17.dp,0.dp,0.dp,0.dp))
            }
            IconButton(onClick = {
                if (text.isNullOrBlank()){
//                    context.showToast("Data saved successfully")

                }
                else{
                    onButtonClick(text)
                    text = ""
                }
            }) {
                if (!isAdd){
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        tint = Color.Red
                    )
                }
                else{
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add",
                        tint = Color.Black
                    )
                }
            }
        }
    }
}