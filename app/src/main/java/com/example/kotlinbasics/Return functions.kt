package com.example.kotlinbasics

fun main() {
    println("Enter first number:")
    val num1 = readln().toInt()

    println("Enter second number:")
    val num2 = readln().toInt()

    val myResults = add(num1, num2)
    println("The result for adding the numbers together is: $myResults")

    val myResults2 = divide(num1, num2)
    println("The result for adding the numbers together is: $myResults2")

    val myResults3 = divideWithoutDecimal(num1, num2)
    println("The result for adding the numbers together is: $myResults3")
}

fun add(num1: Int, num2: Int):Int{
   val result = num1+num2
   return result
}

fun divide(num1: Int, num2: Int):Int{
        val myResultDividedByWithNoDecimal = num1/num2
        return myResultDividedByWithNoDecimal
}

fun divideWithoutDecimal(num1: Int, num2: Int):Double{
    val myResultDividedByWithNoDecimal = num1/num2.toDouble()
    return myResultDividedByWithNoDecimal
}