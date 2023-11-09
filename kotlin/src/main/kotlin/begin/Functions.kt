package begin

fun main() {
    println(testSimple(10))
    println(testString(33))
    val list = testNamedArguments(y = 7, x = 3)
    list.forEach { e -> print("$e ") }
    println()
    testDefaultArguments()
    testDefaultArguments(44, 55)
    testDefaultArguments(69)
    testDefaultArguments(x = 87)
    testDefaultArguments(y = 17)
    val arr = intArrayOf(1, 16, 2, 12, 87, 36, 5, 7, 8, 9, 35, 88, 52, 99)
    testVararg(*arr, 54, 67, 667)

}

fun testSimple(x: Int): Int = x + 5

fun testString(x: Int): String {
    val constanta = 47
    val z = x + constanta
    return "String $z is a result of concatenation with $x and $constanta"
}

fun testNamedArguments(x: Int, y: Int): List<Int> {
    return listOf(34, 65, 33, x, 53, y)
}

fun testDefaultArguments(x: Int = 5, y: Int = 7) {
    println("$x + $y = ${x + y}")
}

fun testVararg(vararg numbers: Int) {
    numbers.sort();
    numbers.forEach { e ->
        if (e % 2 == 0) {
            print("$e ")
        }
    }
    println()
}
