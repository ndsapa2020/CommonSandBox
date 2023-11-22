package basics

import java.time.Year

fun main() {
    println(CompanySingleton.getTagLine())
    println(CompanySingleton.getCopyright())

    val classA = SomeParentClass()
    println(classA.getX())
    println(SomeParentClass.accessY())

}

object CompanySingleton {
    private val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyright() = "Copyright \u00A9 $currentYear The Nurlanbeks. All rights reserved."
}

fun topLevelFunction(str : String) = println(str)

class SomeParentClass {
    companion object {
        private var y = 88
        fun accessY() = "I am accessing private static object $y"
    }

    private val x = 9

    fun getX(): Int {
        return x
    }
}