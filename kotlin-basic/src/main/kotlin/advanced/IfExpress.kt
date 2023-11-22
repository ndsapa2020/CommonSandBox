package advanced

import kotlin.random.Random

fun main(){

    val random = Random(13).nextInt(10)
    println(random)
    val someCondition =  random > 4
    val multi = if (someCondition) {
        println("Might be bigger than 5")
        1000
    } else {
        println("Less than 5")
        -500
    }
    println(multi)
}


