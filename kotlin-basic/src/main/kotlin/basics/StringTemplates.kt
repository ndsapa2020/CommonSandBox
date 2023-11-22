package basics

fun main(){
    val numerator = 24.99
    val denominator = 5.34
    println("The value of $numerator divided by $denominator id ${numerator/denominator}")
    val somPath = """C:\user\Documents\Pictures"""
    val eggName = "Humpty"
    val nurseryRhyme = """|$eggName Dumpty sat on the wall
       |$eggName Dumpty had a great fall
       |All the king's horses and all the king's men
       |Couldn't put $eggName together again.""".trimMargin()
    println(somPath)
    println(nurseryRhyme)
}