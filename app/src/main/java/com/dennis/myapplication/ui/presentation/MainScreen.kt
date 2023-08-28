package com.dennis.myapplication.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dennis.myapplication.CalculatorActions
import com.dennis.myapplication.CalculatorOperation
import com.dennis.myapplication.CalculatorState

@Composable
fun MainScreen(

){
Column(modifier = Modifier.fillMaxSize()) {
    DisplayScreen()
  //  ButtonScreen()
}
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
   // MainScreen()
}

@Composable
fun Calculator(
    state:CalculatorState,
    modifier : Modifier = Modifier,
    onAction:(CalculatorActions) -> Unit
){
    Box (
        modifier = Modifier
    ){
        Column(
            modifier= Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
           Text(
               text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
               textAlign = TextAlign.End,
               modifier= Modifier
                   .fillMaxWidth()
                   .padding(vertical = 32.dp),
               fontSize = 80.sp,
               color = Color.White,
               maxLines = 2
           )

           Row(
               modifier= Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(8.dp)
           ) {
               ButtonRow(
                   name = "AC",
                   modifier = Modifier.background(Color.Blue)
                   .aspectRatio(2f)
                       .weight(2f),
                   onClick = {
                       onAction(CalculatorActions.Clear)
                   }
               )

               ButtonRow(
                   name = "Del",
                   modifier = Modifier.background(Color.Blue)
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       onAction(CalculatorActions.Clear)
                   }
               )

               ButtonRow(
                   name = "%",
                       modifier = Modifier.background(Color.Blue)
                   .aspectRatio(1f)
                   .weight(1f),
                   onClick = {
                       onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                   }
               )

           }
            Row(
                modifier =Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                ButtonRow(
                    name = "9",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                )

                ButtonRow(
                    name = "8",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                )

                ButtonRow(
                    name = "7",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                )
                ButtonRow(
                    name = "/",
                    modifier = Modifier.background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    }
                )

            }
            Row(
                modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                ButtonRow(
                    name = "4",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                )

                ButtonRow(
                    name = "5",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                )

                ButtonRow(
                    name = "6",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                )

                ButtonRow(
                    name = "+",
                    modifier = Modifier.background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row(
                modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ButtonRow(
                    name = "1",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                )

                ButtonRow(
                    name = "2",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                )

                ButtonRow(
                    name = "3",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                )

                ButtonRow(
                    name = "+",
                    modifier = Modifier.background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row(
                modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ButtonRow(
                    name = ".",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    }
                )

                ButtonRow(
                    name = "0",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )

                ButtonRow(
                    name = "=",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                )


            }
        }
    }
}