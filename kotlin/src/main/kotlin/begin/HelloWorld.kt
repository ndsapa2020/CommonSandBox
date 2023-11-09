package begin


fun main() {
    println("Hello world!")
    val test1: String = "Antalya"
    var test2: String = "Hello"

    val test3 = "Warsawa"
    var test4 = "Zdrave"

    println("Before reassigning $test2 $test4")

    test2 = "Alanya"
    test4 = "Zdrave pan!"

    println("$test1 $test2 $test3 $test4")

    val test5 = 45
    var test6 = 30

    println("The sum of to values is ${test5 + test6}")
}
