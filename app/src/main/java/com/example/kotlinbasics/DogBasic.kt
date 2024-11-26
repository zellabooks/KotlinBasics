package com.example.kotlinbasics

fun main(){
    //creating object/instance of the class dog
    var kikiBerryPooch = Dog("kiki Berry Pooch", "Schnoodle", 1)
    var rileyPoochPup = Dog("Riley Pooch Pup", "Boston Terrier", 5)
    var WolfieKitty = Dog("Wolfie Kitty", "Snow Shoe (Not a Dog by the way hee hee hee)", 5)

    //We can now pickup properties of an object in the main
    println("\n${kikiBerryPooch.name} is a ${kikiBerryPooch.breed} and is ${kikiBerryPooch.age} years old printing as a object property from the main class")
    kikiBerryPooch.age = 2  // <--- how to overide the value
    println("\n${kikiBerryPooch.name} is a ${kikiBerryPooch.breed} and next year will be ${kikiBerryPooch.age} years old. printing as a object property from the main class")
    println("Updating ${kikiBerryPooch.name} from her nick name to her real name: Kiki")
    kikiBerryPooch.name = "Kiki"
    println("${kikiBerryPooch.name} is a ${kikiBerryPooch.breed} and next year will be ${kikiBerryPooch.age} years old. printing as a object property from the main class")
}