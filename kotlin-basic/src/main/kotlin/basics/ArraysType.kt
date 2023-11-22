package basics

import java.math.BigDecimal

fun main() {
    val names = arrayOf("John", "Jane", "Jill", "Bill")
    names.sort()
    println(names.contentToString())

    val mixedArray = arrayOf("Hello", 47, BigDecimal(20.5), 'a')
    for (element in mixedArray) {
        if (element is String) {
            println("$element - is a String")
        } else {
            println("$element is a other datatype ")
        }
    }
}