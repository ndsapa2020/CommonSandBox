package basics

enum class MyEnum(val fullName: String, val code: Int){
    HR("Human Resources", 0),
    IT("Information Technologies", 1),
    SALES("Sales Department", 2);
    fun printDepartmentInfo() = println("$fullName and code is $code")
}
fun main(){
    val myInam1 = MyEnum.IT
    val myInam2 = MyEnum.HR
    val myInam3 = MyEnum.SALES
    print(myInam1.fullName)
    print(myInam2.fullName)
    println(myInam3.code)
    myInam1.printDepartmentInfo()
    myInam2.printDepartmentInfo()
    myInam3.printDepartmentInfo()
}