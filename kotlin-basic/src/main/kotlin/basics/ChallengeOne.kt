package basics

import java.util.*

fun main(){
    val hello = "Hello"
    val hello2 = "Hello"

    println("$hello is referentially equal to $hello2:  ${hello === hello2}")
    println("$hello is structurally equal to $hello2:  ${hello == hello2}")

    var someVariable: Int = 2988
    println(someVariable)

    val text: Any = "The Any type is the root of the Kotlin"
    if (text is String) {
        println(text.uppercase(Locale.getDefault()))
    }
}