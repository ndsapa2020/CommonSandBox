package begin

fun main(){
    val rec = Rectangle(4.0, 5.0)
    println(rec.doublePerimeter())
    rec.test
}

data class Rectangle(var height: Double, var length: Double) {
    private var perimeter : Double = (height + length) * 2
        get() = field + 1
        set(value) {
            if (value < 0) {
                println("Negative value is not allowed")
            } else {
                field = value
            }
        }
    fun doublePerimeter(): Double {
        return perimeter * 2
    }
    var test = 1
        get() = field + 1
}