package com.dennis.myapplication

import com.dennis.myapplication.domain.CalculatorOperation

data class CalculatorState(
    val number1:String = "",
    val number2:String="",
    val operation: CalculatorOperation? = null
)
