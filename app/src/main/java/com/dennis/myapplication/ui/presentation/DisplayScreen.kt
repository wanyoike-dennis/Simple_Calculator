package com.dennis.myapplication.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DisplayScreen(){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.DarkGray, RoundedCornerShape(
                    bottomStart = 12.dp,
                    bottomEnd = 12.dp
                )
            )
            .height(300.dp)
    ) {
        CalculationSubScreen()
        CalculationAnswerSubScreen()
    }
}

@Composable
fun CalculationSubScreen(){
    var numbers by remember{
        mutableStateOf(0)
    }
   Row(verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.End,
       modifier = Modifier
           .fillMaxWidth()
           .padding(12.dp)) {
       Text(
           text = numbers.toString(),
           fontSize = 22.sp,
           color = Color.White

       )
   } 
}
@Composable
fun CalculationAnswerSubScreen(){
    var answer by remember {
        mutableStateOf(0)
    }
    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)){
        Text(
            text =answer.toString(),
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