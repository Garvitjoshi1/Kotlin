fun main() {
    printThreeLine()
    printPow(3, 4)
    printPow(2, 6)
    printPow(5, 2)
    printPow(4, 3)
    sumToN(5)
}

//created our own function
fun printPow(base: Int, exponent: Int){
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    println("$base to the power $exponent is $result.")
}

fun printThreeLine(){
    print("First\n") // \n for new line
    println("Second")
    println("Third")
}

fun sumToN(n: Int){
    var sum = 0
    for(i in 1..n){
        sum += i
    }
    println("The sum of the values from 1 to $n is $sum.")
}
