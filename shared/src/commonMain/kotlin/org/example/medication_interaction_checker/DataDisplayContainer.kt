package org.example.medication_interaction_checker

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DataDisplayContainer(){
    Box(Modifier.border(1.dp,
        color = Color.Gray,
        shape = RoundedCornerShape(8.dp)).fillMaxWidth()){
        Column(modifier = Modifier.padding(20.dp)) {
            Text("Result",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold )
            Row {
                Box(contentAlignment = Alignment.Center){
                    Box(
                        modifier = Modifier.size(48.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Shield,
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            tint = Color(0xFF4CAF50)
                        )

                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            modifier = Modifier.size(25.dp),
                            tint = Color.White
                        )
                    }
                }
                Column {
                    Text("Safe", fontSize = 20.sp, color = Color(0xFF006400), fontWeight = FontWeight.Bold)
                    Text("Summary bahut sari Place Holder")
                }
            }
            HorizontalDivider(modifier = Modifier.padding(0.dp,3.dp,0.dp,3.dp), thickness = 1.dp, color = Color.Gray)
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
                Text("Safe")
                Box(Modifier.background(color = Color(0xFF90EE90)).border(1.dp, color = Color(0xFF006400), shape = RoundedCornerShape(3.dp))) {
                    Text("true", color = Color(0xFF006400), modifier = Modifier.padding(6.dp,3.dp,6.dp,3.dp))
                }
            }
            HorizontalDivider(modifier = Modifier.padding(0.dp,3.dp,0.dp,3.dp), thickness = 1.dp, color = Color.Gray)
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween)  {
                Text("Summary")
                Text("true")
            }
            HorizontalDivider(modifier = Modifier.padding(0.dp,3.dp,0.dp,3.dp), thickness = 1.dp, color = Color.Gray)
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween)  {
                Text("Severity")
                Box(Modifier.background(color = Color(0xFF90EE90)).border(1.dp, color = Color(0xFF006400), shape = RoundedCornerShape(3.dp))) {
                    Text("true", color = Color(0xFF006400), modifier = Modifier.padding(6.dp,3.dp,6.dp,3.dp))
                }
            }
            HorizontalDivider(modifier = Modifier.padding(0.dp,3.dp,0.dp,3.dp), thickness = 1.dp, color = Color.Gray)
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween)  {
                Text("Details")
                Text("true")
            }
            HorizontalDivider(modifier = Modifier.padding(0.dp,3.dp,0.dp,3.dp), thickness = 1.dp, color = Color.Gray)
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween)  {
                Text("Recommendation")
                Text("true")
            }
        }
    }
}