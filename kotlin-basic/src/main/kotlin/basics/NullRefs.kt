package basics

fun main(){
    var str: String? = null
    str = "ffj"
    println("What happens when we do this: ${str!!.uppercase()} ")
    str = null
    val str2 = str ?: "This is default value"
    println("What happens when we do this: ${str2.uppercase()}")

    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts){
        print("$i ")
    }
    println()
    val nullableStrings = arrayOfNulls<String>(5)
    for (i in nullableStrings.indices){
        print("${nullableStrings[i]} converted to -> ")
        nullableStrings[i] = "some not null value $i"
        println("${nullableStrings[i]} ")

    }

    val nullableIntArray = Array<Int?>(40) { i -> (i + 1) * 5}
    for (i in nullableIntArray) {
        print("$i ")
    }
    val x: String? = "I AM IN UPPERCASE"
    val anotherX = x?.lowercase() ?: "I give up!"
    println("\n$anotherX")
}
class NullRefs {
}