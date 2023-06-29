package com.example.tutorial03sample.models

class Calculator (private val number1:Double, private val number2:Double){
    fun add() = number1 + number2
    fun subtract() = number1 - number2
    fun divide() = number1 * number2
    fun multiply() = number1 / number2
}