package com.example.calculatorcompose

sealed class CalculatorOperation(val content: String) {
    object Add: CalculatorOperation("+")
    object Substract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")

}
