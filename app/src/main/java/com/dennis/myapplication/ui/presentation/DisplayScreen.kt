package com.dennis.myapplication.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DisplayScreen(){

    Column(
        modifier = Modifier.fillMaxWidth()
            .background(
                Color.Black,RoundedCornerShape(
                bottomStart = 12.dp,
                bottomEnd = 12.dp
                ))
            .size(150.dp)
    ) {
        CalculationSubScreen()
        CalculationAnswerSubScreen()
    }
}

@Composable
fun CalculationSubScreen(){
   Row(verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.End,
       modifier = Modifier.fillMaxWidth()
       .padding(12.dp)) {
       Text(
           text = "1",
           fontSize = 22.sp,
           color = Color.White

       )
   } 
}
@Composable
fun CalculationAnswerSubScreen(){
    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier.fillMaxWidth()
        .padding(12.dp)){
        Text(
            text ="0",
            fontSize = 20.sp,
            color = Color.White
        )
    }
}

@Preview
@Composable
fun DisplayScreenPreview(){
    DisplayScreen()
}