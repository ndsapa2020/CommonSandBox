package basics

fun main() {
    val employee = CompanyEmployee("Nurlan")
    println("${employee.getFirstName()} is ${if (employee.fullTime) "in" else "out of"} the Company")

    val employee2 = CompanyEmployee("Mirlan", false)
    println("${employee2.getFirstName()} is ${if (employee2.fullTime) "in" else "out of"} the Company")
    employee2.fullTime = true


    println(Dummy().dummy)
    secondMain()
}

class CompanyEmployee(private var firstName: String) {
    var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime;

    }

    fun getFirstName(): String {
        return firstName
    }
}

class Dummy {
    val dummy: String = "Hello"

    constructor()
}

fun secondMain() {
    println("\n-------------------")
    val empos1 = SecEmployee("John", "in 2002")
    println("${empos1.name} joined  ${empos1.employedTime}")
    empos1.employedTime = "in 1999"
    println("${empos1.name} joined ${empos1.employedTime}")
    val constanta = ImmutableDataClass(3333)
    println("${constanta.count} and default ${constanta.defConstant}")
    println(constanta)
    val constanta2 = ImmutableDataClass(3333)
    println("Structural equality ${constanta == constanta2}")
    println("Referential equality ${constanta === constanta2}")
    val constanta3 = constanta.copy(count = 5573)
    println(constanta3)
}

class SecEmployee(val name: String, employedTime: String = "last year"){
     var employedTime = employedTime
        get() {
            println("running the custom getter")
            return field
        }
         set(value){
             println("running the custom setter")
             field = value
         }
}
const val MY_CONSTANT = 1976
data class ImmutableDataClass(val count: Int){
    val defConstant = MY_CONSTANT
    override fun toString(): String {
        return "My data has count=$count and defConstant=$defConstant"
    }

}