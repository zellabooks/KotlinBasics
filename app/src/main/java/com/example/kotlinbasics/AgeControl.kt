package com.example.kotlinbasics

fun main() {
     println("Your have hired to be our bouncer")
    println("You got your job WHOOO!")
    println("Job details: You need to check ages at the door to mke sure no one under 21 tries to get in")
    println("First night the customers start to come in and you set to stand at the door.")

    var customerAge = 0
    println("Hey you, you gotta put in your age first before entering please")
    println("Add your age below:")
    customerAge =
        readln().toInt() //what is given is taken from a string and turned into a number called int.
    println("I got your age down here as $customerAge Let me double check that id...")

    if (customerAge >= 40) {
        //if true run this
        println("Hey this is a club for people 21-40. Get out of here you hoser!")
    } else if (customerAge >= 21) {
        println("Welcome to the club. Right this way.")
        //if not true then this run this
    } else if (customerAge < 16){
        println("Hey that's a fake ID Security! Security!")
    }else {
        println("You can't enter the the club. Your not old enough. Get out of here you hoser!")
    }
}