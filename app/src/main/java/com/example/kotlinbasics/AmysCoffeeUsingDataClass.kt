package com.example.kotlinbasics

data class CoffeeDetails(
    val buyersName :String,
    val roast :String,
    val sugarPacketCount :Int,
    val creamAmount :Int
)

fun main() {

    val coffeeForLiam = CoffeeDetails(
        buyersName = "Liam",
        roast = "Dark Blend Beans",
        sugarPacketCount = 18,
        creamAmount = 55
    )
    makeCoffee(coffeeForLiam)
}
    //define function
    fun makeCoffee(coffeeDetails: CoffeeDetails) {
        println("\nThanks ${coffeeDetails.buyersName} The magic is happening now!\n")

        if (coffeeDetails.sugarPacketCount == 1) {
            println("${coffeeDetails.sugarPacketCount} packet of Sugar added to your order")
        } else if (coffeeDetails.sugarPacketCount == 0) {
            println("No packets of Sugar added")
        } else {
            println("${coffeeDetails.sugarPacketCount}  packet of Sugar added to your order")
        }
        println("Grinding the ${coffeeDetails.roast} now...")
        println("Finely ground ${coffeeDetails.roast} dropped into the strainer")
        println("Heating the water to 120 F...")
        println("Putting the coffee cup below the strainer")
        println("Pouring the hot water through the strainer")
        println("Catching your yummy coffee with the cup")
        println("dropping ${coffeeDetails.sugarPacketCount} packets of sugar in your cup")
        println("Dropping ${coffeeDetails.creamAmount} packets of creamer in your cup")
        println("${coffeeDetails.buyersName} your coffee is ready to Enjoy. Please grab your cup now. Careful it might be hot!")
        println("\n")
    }

