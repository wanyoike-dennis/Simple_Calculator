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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dennis.myapplication.domain.CalculatorActions
import com.dennis.myapplication.domain.CalculatorOperation
import com.dennis.myapplication.CalculatorState
import com.dennis.myapplication.ui.theme.Pink80

@Composable
fun Calculator(
    state:CalculatorState,
    modifier : Modifier = Modifier,
    onAction:(CalculatorActions) -> Unit
){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(16.dp)
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
               fontWeight = FontWeight.Light,
               fontSize = 80.sp,
               color = Color.White,
               maxLines = 2
           )

           Row(
               modifier= Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(8.dp)
           ) {
               SingleButton(
                   name = "AC",
                   modifier = Modifier.background(Color.LightGray)
                   .aspectRatio(2f)
                       .weight(2f),
                   onClick = {
                       onAction(CalculatorActions.Clear)
                   }
               )

               SingleButton(
                   name = "Del",
                   modifier = Modifier.background(Color.LightGray)
                       .aspectRatio(1f)
                       .weight(1f),
                   onClick = {
                       onAction(CalculatorActions.Clear)
                   }
               )

               SingleButton(
                   name = "X",
                       modifier = Modifier.background(Pink80)
                   .aspectRatio(1f)
                   .weight(1f),
                   onClick = {
                       onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                   }
               )

           }
            Row(
                modifier =Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                SingleButton(
                    name = "7",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                )

                SingleButton(
                    name = "8",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                )

                SingleButton(
                    name = "9",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                )
                SingleButton(
                    name = "/",
                    modifier = Modifier.background(Pink80)
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

                SingleButton(
                    name = "4",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                )

                SingleButton(
                    name = "5",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                )

                SingleButton(
                    name = "6",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                )

                SingleButton(
                    name = "-",
                    modifier = Modifier.background(Pink80)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            Row(
                modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                SingleButton(
                    name = "1",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                )

                SingleButton(
                    name = "2",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                )

                SingleButton(
                    name = "3",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                )

                SingleButton(
                    name = "+",
                    modifier = Modifier.background(Pink80)
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
                SingleButton(
                    name = ".",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    }
                )

                SingleButton(
                    name = "0",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )

                SingleButton(
                    name = "=",
                    modifier = Modifier.background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                )


            }
        }
    }
}