package begin

fun main(){
    var a: String = "Immutable string"
    // a =  null  // NPE impossible
    var n1 = a.length

    var b : String? = "Could be null"
    b = null // can be null
    var n2 = b?.length ?: 0
    n2 += 10
    println("${n1 + n2}")
}