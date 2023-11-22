package challenge.two

fun main() {
//    sequenceWithStep(0, 5000, 5)
    fibonacchi(15)
    println()
    taskExpression(56)
}

fun sequenceWithStep(start: Int, end: Int, step: Int) {
    val range = start..end
    var caret = 0;
    for (i in range step step) {
        print("$i ")
        caret++
        if (caret % 20 == 0) {
            println()
        }
    }
}

fun fibonacchi(n: Int) {
    print("Fibonacchi nums until $n : ")
    var prev = 0
    var curr = 1
    var next: Int
    for (i in 1..n) {
        print(prev)
        if (i < n) {
            print(", ")
        } else {
            print(".")
        }
        next = prev + curr
        prev = curr
        curr = next
    }
}

fun taskExpression(num: Int) {
    val dnum =
        when {
            num > 100 -> -234.567
            num < 100 -> 4444.555
            else -> 0.0
        }
    println(dnum)
}