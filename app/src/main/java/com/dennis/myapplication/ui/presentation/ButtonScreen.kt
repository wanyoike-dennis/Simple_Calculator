package com.dennis.myapplication.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonScreen(){

Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxWidth()
        .fillMaxHeight()
        .background(Color.Black, RoundedCornerShape(
            topStart = 12.dp,
            topEnd=12.dp
        ))
) {

    Spacer(modifier = Modifier.height(6.dp))

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier= Modifier.fillMaxWidth()){
        ButtonRow(name = "AC")
        ButtonRow(name = "()")
        ButtonRow(name = "%")
        ButtonRow(name = "/")
    }
    Spacer(modifier = Modifier.height(4.dp))
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier= Modifier.fillMaxWidth()){
        ButtonRow(name = "7")
        ButtonRow(name = "8")
        ButtonRow(name = "9")
        ButtonRow(name = "X")
    }
    Spacer(modifier = Modifier.height(4.dp))
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier= Modifier.fillMaxWidth()){
        ButtonRow(name = "4")
        ButtonRow(name = "5")
        ButtonRow(name = "6")
        ButtonRow(name = "-")
    }
    Spacer(modifier = Modifier.height(4.dp))
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier= Modifier.fillMaxWidth()){
        ButtonRow(name = "1")
        ButtonRow(name = "2")
        ButtonRow(name = "3")
        ButtonRow(name = "+")
    }
    Spacer(modifier = Modifier.height(4.dp))
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier= Modifier.fillMaxWidth()){
        ButtonRow(name = "0")
        ButtonRow(name = ".")
        ButtonRow(name = "del")
        ButtonRow(name = "=")
    }
}
}

@Composable
fun ButtonRow(name:String){

    Button(
        modifier = Modifier.size(90.dp),
        onClick = { /*TODO*/ }) {
        Text(text = name)
    }
    Spacer(modifier = Modifier.width(4.dp))
}


@Preview
@Composable
fun ButtonScreenPreview(){
ButtonScreen()
}