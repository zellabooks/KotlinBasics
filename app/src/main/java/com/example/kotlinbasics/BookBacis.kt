package com.example.kotlinbasics

fun main(){
    //creating object/instance of the class dog
    var ZellasAwakening = Book("The Land Of Zella, Zellas Awakening", "Braden Wheeler")
    var InstinctOfADragon = Book("The Land Of Zella, Instinct of a Dragon", "Braden Wheeler")


    //We can now pickup properties of an object in the main
    println("${ZellasAwakening.name} is authored by ${ZellasAwakening.author}" )
    println("${InstinctOfADragon.name} is authored by ${InstinctOfADragon.author}" )
}