package com.example.kotlinbasics

fun main(){
  //while loop waiting dependant on user input
    println("Welcome to the one game! Its so fun! Don't you dare press anything but 1!")
    println("Ok enter a number below:")
    var userInput = readln()
    while (userInput == "1"){
        println("Don't you dare press anything but 1.")
        println("Ok enter a number below:")
        userInput = readln()
    }
    println("NOOOOO you didn't press 1 aghhhhh. \n")
    println("Starting self destruction mode.")

 //while loop using counter
    println("self destruction on the count of 10")
    var count = 1
    while (count < 11){
        //until while is not true

        println("self destruction in: $count")
        count++
    }
    println("\n App has self destructed")
}