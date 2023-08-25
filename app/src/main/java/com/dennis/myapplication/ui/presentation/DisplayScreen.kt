package com.dennis.myapplication.ui.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun DisplayScreen(){

    Column {
        CalculationSubScreen()
        CalculationAnswerSubScreen()
    }
}

@Composable
fun CalculationSubScreen(){
   Row {
       Text(
           text = "1",
           fontSize = 22.sp,
           color = Color.White

       )
   } 
}
@Composable
fun CalculationAnswerSubScreen(){
    Column{
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