package anotherpackage

import basics.CompanySingleton as Comm
import basics.topLevelFunction

fun main(){
    topLevelFunction("Hello From another class")
    val rights = Comm.getCopyright()
    println(rights)
}