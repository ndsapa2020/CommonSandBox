package advanced

fun main(){
    val range = 1..5
    val charsRange = 'A'.. 'Z'
    for (i in charsRange) {
        print(i.lowercase())
    }
    println()
    val stepRange = 3..15
    for (i in stepRange.step(5)){
        print(i)
    }
    println()
    val stepRangeSteps = stepRange.step(3)
    println(4 in stepRangeSteps)
    println(6 in stepRangeSteps)
    println("------------------")
    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (index in seasons.indices) {
        println("Season ${seasons[index]} is season number $index")
    }
}