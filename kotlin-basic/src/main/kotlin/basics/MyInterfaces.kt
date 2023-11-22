package basics

interface MyInterface {
    val number : Int
    val number2 : Int
        get() = number * 100
    fun myFunction(str: String) : String
}

interface MyChildInterface : MyInterface {
//    override fun myFunction(str: String): String {
//        TODO("Not yet implemented")
//    }
    fun myOtherFunction(int: Int): Boolean
}

data class MyClass(override val number: Int) : MyChildInterface{
    override fun myOtherFunction(int: Int): Boolean {
        val res = int * 500
        println("Returned $int result is res")
        return res < 0
    }

    override fun myFunction(str: String): String {
        val res = "Returned $str value"
        println(res)
        return res
    }

}

fun main(){
    val instance = MyClass(33)
    instance.myFunction("Some argument")
    instance.myOtherFunction(78)
    println(instance.number2)
}