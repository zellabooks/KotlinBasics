package com.example.kotlinbasics

fun main() {
    //Note val can't re assign to it inmutebale
    //val number1 = 1

    //Note Var you can change later or overide it muteable
    var myAge = 35
    myAge = 36

    //Note you can save space
    val myAgeByte : Byte = 36

    //float so like 1.5 or 2.0
    val pi = 3.1f

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    val myChar = "I made a char!"
    val copyWriteWords = "This is a copywrite symbol: "
    val copyWriteSign = '\u00AE'
    val copyWriteBoth = copyWriteWords + copyWriteSign
    val name = "We made a string"

    val chritiansName = "Christian"
    val chrstiansAge = 21
    val JohnysAge = 18
    val JimsAge = 12

    println(chritiansName)
    println(chrstiansAge)

    //comparison operators
    // greater then >
    //lower then <
    // greater than or equal too >=
    // lower then or equal too <=
    // equal ==




    println("Hello I am pretty cool")
    println(myAge)
    println(myAgeByte)
    println(pi)
    println(myTrue || myFalse) // True
    println(myTrue && myFalse) // False
    println(!myTrue) // False
    println(myChar)
    println(copyWriteBoth)
    println(name)
    println(name.toUpperCase())
    println(name.toLowerCase())
    println("\n" + name + "\n" + copyWriteBoth)


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