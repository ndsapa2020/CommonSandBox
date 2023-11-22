package basics

fun main(){
    val myOldPrinter = Printer("HP LaserJet")
    println("My Printer ${myOldPrinter.name} was bought very long times ago")
    myOldPrinter.printModel()
    val myPrinter = LaserPrinter("HP LaserJet", "2005")
    println("My Printer ${myPrinter.name} was bought ${(2023 - myPrinter.year)} years ago")
    myPrinter.printModel()
}

open class Printer(modelName: String) {
    val name : String = modelName
    open fun printModel() =
        println("This model name is $name")
}

class LaserPrinter(name: String, year: String) : Printer(name){
    val year : Int = Integer.parseInt(year)
    override fun printModel() =
        println("This laser printer's name is $name and year is $year")
}