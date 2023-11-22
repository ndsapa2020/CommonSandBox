package advanced

import java.lang.NumberFormatException
import javax.print.attribute.IntegerSyntax

fun main() {

}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    }
}