package com.example.kotlinbasics

//by adding val you can make a property
//now you can have multiple dogs sent in using one class named dog.
class Book (val name: String, val author: String){

    init {
        bookData(name)
    }

        fun bookData(bookName: String) {
            println("$name is the name of one of $author books.")

        }
}
