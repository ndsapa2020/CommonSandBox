package basics

typealias EmployeeArray = MutableList<Employee>

fun main() {
    val constantNumber: Long = 25
    println("Printing constant value $constantNumber")
    var mutableNumber = 47
    mutableNumber++
    println("Printing mutable variable $mutableNumber")
    val employee1 = Employee("Alexey", 1)
    println("Employee name is ${employee1.name} and id ${employee1.id}")
    employee1.name = "Nick"
    println("Employee name is ${employee1.name} and id ${employee1.id}")
    val employeesArray: EmployeeArray = mutableListOf()
    employeesArray.add(employee1)
    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])
    println("\nChecking equality of Employees")
    val empOne = Employee("Mary", 11)
    val empTwo = Employee("John", 12)
    val empThree = Employee("John", 12)

    println(empOne === empTwo)
    println(empTwo === empThree)
    val empFour = if (empThree.id > empOne.id) {
        empThree
    }  else  {
        empOne
    }
    println(empTwo === empFour)
    println(empThree === empFour)
    println(empOne == empTwo)
    println(empTwo == empThree)
    println(empTwo == empFour)
    println(empThree == empFour)
    println(empTwo != empFour)
    println(empThree !== empFour)

    var something: Any = empFour
    if (something is Employee) {
        val empFive = something as Employee
        println(empFive)
    }
}

class Employee(var name: String, val id: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return this.name == other.name && this.id == other.id
        }
        return false
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}