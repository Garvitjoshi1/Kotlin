fun main() {
    val x = 4
    val y = 5
    println(x == y)
    println(x > y)
    println(x < y)
    println(x >= y)
    println(x <= y)
    println(x != y)

    var a = 5
    var b = 6
    println("And Expression ${x == y && b == a}") // for and both condition need to be true.
    println("OR expression ${x == y || a == b}") // for or one of the condition need to be true.
    println("Not expression with OR ${!(x == y) || a == b}")
    print("Not expression with AND ${!(x == y) && a == b}")

    println("====================HOMEWORK==================")
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)

    val bool = true
    val m = 9
    val n = 3
    val o = 9
    val hardExpression = !(m != o) && bool || o > (m + n) && (!bool || n < o)
    print(hardExpression)
}
