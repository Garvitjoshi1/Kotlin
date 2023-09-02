import kotlin.math.PI
import kotlin.math.pow

fun main(){
    var x = 20
    var y = 8

    println("The result of x/y (int) is: ${x/y}")

    var v = 20F
    var u = 3
    println("The result of v/u (float) is: ${v/u}")

    var z = 20F
    var g = 3F
    println("The result of z/g (float) is: ${z/g}")

    var a = 20.028238F
    var b = 3.438478F
    println("The result of a/b (float) is: ${a/b}")


    var c = 20.028238
    var d = 3
    println("he result of c/d (double) is: ${c/d}")
    /* Double provides more accurate answer than float, but we don't use it because more accurate answer require
     more space to store where float takes only 32 bits of space double takes 64 bits of space. */

    println("=============Homework=============")
    print("Enter radius of sphere: ")
    val r = readln()
    val volume = (4.0/3.0) * PI * r.toDouble().pow(3.0)
    print("The volume of sphere is: $volume")
}
