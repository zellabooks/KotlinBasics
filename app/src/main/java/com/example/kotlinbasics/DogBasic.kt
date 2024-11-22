package com.example.kotlinbasics

fun main(){
    //creating object/instance of the class dog
    var kikiBerryPooch = Dog("kiki Berry Pooch", "Schnoodle")
    var rileyPoochPup = Dog("Riley Pooch Pup", "Boston Terrier")
    var WolfieKitty = Dog("Wolfie Kitty", "Snow Shoe (Not a Dog by the way hee hee hee)")

    //We can now pickup properties of an object in the main
    println("\n${kikiBerryPooch.name} is a ${kikiBerryPooch.breed} printing as a object property from the main class")
}