package begin

fun main() {
    testWhen(11)
    testWhen("Some String value")
    testWhen(1)
    testWhen(1.3)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        in 1..20 -> println("Integer $input")
        is String -> println("It is a String $input")
        else -> println("something else")
    }
}