fun main() {
    var x = 15
    val y = 7
    println("<===========================Addition==========================>")
    var result = x + y
    println(result)
    println("The result of x + y is : ${x + y}")
    // ============================================== //
    println(15+7)
    // ============================================== //
    result = 18 + 7
    println("The updated value fo result is : $result")

    println("<===========================Subtraction========================>")
    println(15-7)

    println("<===========================Multiplication=====================>")
    println(15*7)

    println("<===========================Division===========================>")
    println(15/7) // return integer value as division is b/w integers

    println("<===========================Modulus============================>")
    println(15 % 7)

    x += 10 // x = x + 10
    println("Added value of a is : $x")

    x -= 10 // x = x - 10
    println("Subtracted value of a is : $x")

    x *= 10 // x = x * 10
    println("Multiplied value of a is : $x")

    x /= 10 // x = x / 10
    println("Divide value of a is : $x")

    x %= 10 // x = x % 10
    println("Mod value of a is : $x")

    println("=====================HomeWork=====================")
    val a = 3
    val b = a + 1
    val c = b + 1 // c = a + 2
    println("The value fo a is : $a")
    println("The value fo a+b is : ${a+b}")
    println("The value fo a+b+c is : ${a+b+c}")

}
