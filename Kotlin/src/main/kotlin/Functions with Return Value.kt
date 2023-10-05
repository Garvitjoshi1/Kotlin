fun main() {
    val pow = printPow1(3, 5)
    println("3 to the power 5 is $pow")
    println("The product is: ${multiply(3, 5)}")
    val list1 = listOf(1, 5, 8, 4, 2)
    println(printIndexOfList(list1, 5))
    println(printIndexOfList(list1, 2))
    println(printIndexOfList(list1, 1))
}

//created our own function
fun printPow1(base: Int, exponent: Int) : Int {
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    return result
    // print("after"), we can't use print once return used as now function is over.
}

fun multiply(a:Int, b:Int) = a*b

fun printIndexOfList(list: List<Int>, num:Int): Int {
    for(i in list.indices) {
        /*
        Indices is an extension property that returns an IntRange of valid indices for a collection.
        This can be used to iterate over a collection by index
        */
       if(list[i] == num){
           return i
       }
   }
   return -1
}
