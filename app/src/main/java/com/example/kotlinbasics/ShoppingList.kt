package com.example.kotlinbasics

fun main() {
    // reference for how lists save [0][1][2][3] etc etc Awesomer l
    //Immutable list can't change anything in this one
    val shoppingListImmutable = listOf("Processor", "Ram", "Graphics Card", "SSD")

    //mutable can be changed the things in it as you go
    val shoppingList = mutableListOf("Processor", "Ram", "Graphics Card RTX 3060", "SSD")
    println("Original shopping list $shoppingList")
    //adding items to the mutable list
    shoppingList.add("Cooling system")
    println("Added item cooling system to list: $shoppingList")
    //removing items to the mutable list
    shoppingList.remove("Graphics Card RTX 3060")
    println("Removed older graphics card from shopping list $shoppingList")
    //replacing the removed item from the mutable list
    shoppingList.add("Graphics Card RTX 4090")
    println("Added a newer graphics card to the shopping list: $shoppingList")
    //use index to make sure you remove something but using index location instead of by name
    shoppingList.removeAt(4)
    println("Removed the Graphics card from wrong spot in the list: $shoppingList")
    //use index to make sure you add something back to where we removed it from
    shoppingList.add(4, "Graphics Card RTX 4090")
    println("Finalized shopping list I hope: $shoppingList")
    //print an item from the index to check it.
    print("we gotta switch to an AMD cards instead of this: ")
    println(shoppingList[4])

    shoppingList[4] = "Graphics Card RX 7800XT"
    println("New list, what can I say we wanted an AMD: $shoppingList")

    //set allows you to set a different item in place of another item in the list.
    shoppingList.set(3, "Water cooling")
    println("Upgraded cooling type: $shoppingList")

    //Check what the list contains If it contains it, it will return true else it will return false
    println("Shopping List: $shoppingList")
    val hasRam = shoppingList.contains("Ram")
    println(hasRam)
    if (hasRam) {
        println("Has Ram already in the list")
    } else {
        println("Does not have Ram in the list")
    }

    println("\nUse for loop to look and see whats left in the list")
    for(item in shoppingList){
        println(item)
    }

    println("\nUse for loop to look and see whats left in the list and break when Ram is found")
    for(item in shoppingList){
        println(item)
        if(item == "Ram"){
            break
        }
    }

    println("\nLet check how many items we have in the list")
    print(" total number of items: ")
    println(shoppingList.size)
    for(item in 0 until shoppingList.size){
        println(item)
        println("Print items as they exists in the list:")
    }

     for(index in 0 until shoppingList.size){
        println("Item ${shoppingList[index]} is at index $index")
    }

    /* was asked to add this but the it requires another version so here it is in all its glory commented out
    println("\nUse for loop to look and see whats left in the list but lets delete the last item")
    for(item in shoppingList){
        println(item)
        shoppingList.removeLast()
    }
*/
}
