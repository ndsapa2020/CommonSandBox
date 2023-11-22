package challenge.one.kotlin

fun main() {
    funOne()
}

fun funOne() {
    val kotlinBicycle = KotlinBicycle(90, 28, 7)
    val curCadence = kotlinBicycle.cadence
    val curGear = kotlinBicycle.gear
    var curSpeed = curCadence * curGear
    kotlinBicycle.applyBrake(87)
    kotlinBicycle.speedUp(45)
    if (curSpeed < kotlinBicycle.speed) {
        kotlinBicycle.speed = curSpeed
    } else {
        curSpeed = kotlinBicycle.speed
    }
    println("Gear = ${kotlinBicycle.gear} cadence = ${kotlinBicycle.cadence} and speed = $curSpeed")
    kotlinBicycle.printDescription()

    val mountainBike = MountainBike(49, 35, 42, 3)
    mountainBike.color = "Green"
    mountainBike.speedUp(23)
    mountainBike.seatHeight = 33
    val height = mountainBike.seatHeight
    println(height)
    println(mountainBike.printDescription())

    val roadBike = RoadBike(1, 105, 38, 8)
    println(roadBike.printDescription())

    val kotlinBicycle2 = KotlinBicycle(90, 28)
    kotlinBicycle2.printDescription()

    val roadBike2 = RoadBike(cadence = 105, speed = 38, gear = 8)
    println(roadBike2.printDescription())

    val mountainBike2 = MountainBike("Yellow", 38, 76, 26, 3)
//    println(mountainBike2.color)
    mountainBike2.printDescription()
    KotlinBicycle.availableColors.forEach { print("$it ") }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 8) {
    lateinit var color: String

    companion object {
        val availableColors: List<String> = listOf("blue", "red", "white", "magenta", "green")
    }

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() =
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed")
}

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int) : KotlinBicycle(cadence, speed, gear) {

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int) :
            this(seatHeight, cadence, speed, gear) {
        this.color = color
        println("This is the color $color")
    }

    //    var color = color
    override fun printDescription() {
        super.printDescription()
        println("It is a Mountain Map with seat height = $seatHeight inches and color - $color")
    }
}

class RoadBike(val tyreWidth: Int = 1, cadence: Int, speed: Int, gear: Int) : KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("It is a roadMap that is why it has additional field tyreWidth = $tyreWidth inches")
    }
}

