package com.example.kotlinbasics

fun main() {

    val fruitList = mutableListOf("Apple", "Pineapple", "Orange", "Peach")

    println("Original Fruit list $fruitList")
    //adding items to the mutable list
    fruitList.add("Mango")
    println("Added Mango: $fruitList")
    //removing items to the mutable list
    fruitList.remove("Apple")
    println("Removed Apple from the list $fruitList")

   //Check what the list contains If it contains it, it will return true else it will return false
    println("Fruit List: $fruitList")
    val fruits = fruitList.contains("Orange")
    println(fruits)
    if (fruits) {
        println("Has Orange already in the list")
        println("Make some Orange Juice")
    } else {
        println("Does not have Orange in the list")
        println("You do not get any Orange juice!")    }
}
