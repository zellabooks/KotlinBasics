package com.example.kotlinbasics

//by adding val you can make a property
//now you can have multiple dogs sent in using one class named dog.
class Dog (var name: String, var breed: String, var age: Int){

    init {
        bark(name)
    }

        fun bark(name: String) {
            println("$name is a $breed and is $age years old. \n Woof Woof printing as an accessed property in another class")
    }
}
