package com.example.kotlinbasics
/* Multi line comment starts with /*    ends with */
data class CoffeeDetails(
    val buyersName :String,
    val roast :String,
    val sugarPacketCount : Int
    val creamAmount :Int
)
*/

fun main(){
    //User system where users add the values
    println("Welcome to Amy's Coffee maker Please enter your name below:")
    var buyersName = readln()
    println("Thanks $buyersName")
    println("$buyersName How many packets of sugar would you like? Please enter the number below:")
    var sugarPacketCount = readln().toInt()
    println("Perfect thanks $buyersName adding $sugarPacketCount packets of sugar to your order")
    println("We have four roast blends what kind would you like? \n Choices are: Light, Medium, Dark, or Caffeine free. \n " +
            "For Light press 1, Medium press 2, Dark press 3, or Caffeine free press 4" )
    var roastNumber = readln().toInt()
    var roast = ""

    if(roastNumber == 1){
        println("Light Blend Beans selected")
        roast = "Light Blend Beans"
    }else if(roastNumber == 2){
        println("Medium Blend Beans selected")
        roast = "Medium Blend Beans"
    }else if(roastNumber == 3){
    println("Dark Blend Beans selected")
        roast = "Dark Blend Beans"
    }else{
        println("Caffeine free Beans selected")
        roast = "Caffeine free Beans"
    }

    println("Perfect $buyersName You have selected $roast with $sugarPacketCount packets of Sugar.")
    makeCoffee(buyersName, roast, sugarPacketCount)

 //call created function make coffee
//Manual system
//     makeCoffee("Jim", "caffeine free Roast beans", 0)
//     makeCoffee("Joe","Light Roast beans", 1)
//     makeCoffee("Lisa","caffeine free Roast beans", 3)
//     makeCoffee("Marcio","Dark Roast beans", 5)
//    makeCoffee("Jazmin","Medium Blend beans", 20)
//    makeCoffee("Linda","Super Dark Roast beans",50)
}

//define function
fun makeCoffee(buyersName :String, roast :String, sugarPacketCount : Int){
    println("\nThanks $buyersName The magic is happening now!\n")

    if(sugarPacketCount ==1){
        println("$sugarPacketCount packet of Sugar added")
    }else if(sugarPacketCount ==0){
        println("No packets of Sugar added")
    }else{
        println("$sugarPacketCount packets of Sugar added")
    }
    println("Grinding the $roast now...")
    println("Finely ground $roast dropped into the strainer")
    println("Heating the water to 120 F...")
    println("Putting the coffee cup below the strainer")
    println("Pouring the hot water through the strainer")
    println("Catching your yummy coffee with the cup")
    println("$buyersName your coffee is ready to Enjoy. Please grab your cup now. Careful it might be hot!")
    println("\n")
}
