package academy.other

class AddStringNums {
    fun addStringsFromLC(num1: String, num2: String): String {
        val str = StringBuilder()
        var i = num1.length - 1
        var j = num2.length - 1
        var carry = 0
        var sum: Int
        while (i >= 0 || j >= 0 || carry > 0) {
            val digit1 = if (i >= 0) num1[i--].code - '0'.code else 0
            val digit2 = if (j >= 0) num2[j--].code - '0'.code else 0
            sum = digit1 + digit2 + carry
            str.append(sum % 10)
            carry = sum / 10
        }
        return str.reverse().toString()
    }

    fun addStrings(num1: String, num2: String): String {
        val sb = StringBuilder()
        val arr1 = num1.split("".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val arr2 = num2.split("".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var p1 = num1.length - 1
        var p2 = num2.length - 1
        var rem = 0
        while (p1 > 0 && p2 > 0) {
            val d1 = arr1[p1].toInt()
            val d2 = arr2[p2].toInt()
            val currSum = d1 + d2 + rem
            rem = addCurrentSum(sb, currSum)
            p1--
            p2--
        }
        while (p1 > 0) {
            val d = arr1[p1].toInt()
            val currSum = d + rem
            rem = addCurrentSum(sb, currSum)
            p1--
        }
        while (p2 > 0) {
            val d = arr2[p2].toInt()
            val currSum = d + rem
            rem = addCurrentSum(sb, currSum)
            p2--
        }
        if (rem == 1) {
            sb.append(1)
        }
        return sb.reverse().toString()
    }

    private fun addCurrentSum(sb: StringBuilder, currSum: Int): Int {
        val digitToAdd: Int
        var rem = 0
        if (currSum > 9) {
            digitToAdd = currSum - 10
            rem = 1
        } else {
            digitToAdd = currSum
        }
        sb.append(digitToAdd)
        return rem
    }


}

fun main(){
    val addStrings = AddStringNums()
    println(addStrings.addStrings("456", "77"))
    println(addStrings.addStringsFromLC("456", "77"))
}