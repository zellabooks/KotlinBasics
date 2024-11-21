package com.example.kotlinbasics

fun main(){
    println("Enter first number:")
    val num1 = readln().toInt()

    println("Enter second number:")
    val num2 = readln().toInt()

    val myResult = add(num1, num2)
    println("The result is $myResult")
}

fun add(num1: Int,num2: Int):Int{
   val result = num1+num2
    return result
}
