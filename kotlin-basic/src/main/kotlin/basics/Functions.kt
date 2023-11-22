package basics

fun main() {
    val s = "this string is in lowercase"
    println(s.upperFirstAndLast())
}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(length - 1).uppercase()
}


class Other{

}