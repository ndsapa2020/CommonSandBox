package begin

fun main(){
    val items = listOf("apple", "banana", "orange")

    for (item in items) {
        println("This is a $item")
    }
    println("----------")
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }
    for (i in 1..27) {
        print("$i ")
    }
    println()
    for (i in 1 until 28) {
        print("$i ")
    }
    println()
    for (i in 0..125 step 5){
        print("$i ")
    }
}