package com.example.kotlinbasics

//by adding val you can make a property
//now you can have multiple dogs sent in using one class named dog.
class Dog (val name: String, val breed: String){

    init {
        bark(name)
    }

        fun bark(name: String) {
            println("$name is a $breed Woof Woof printing as an accessed property in another class")
    }
}
