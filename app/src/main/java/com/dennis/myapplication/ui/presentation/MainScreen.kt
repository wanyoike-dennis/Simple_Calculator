package com.dennis.myapplication.ui.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen(){
Column(modifier = Modifier.fillMaxSize()) {
    DisplayScreen()
    ButtonScreen()
}
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    MainScreen()
}